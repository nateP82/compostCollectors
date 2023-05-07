package com.compostcollectors.controller;

import com.compostcollectors.compostingAPI.Material;
import com.compostcollectors.compostingAPI.Period;
import com.compostcollectors.compostingAPI.Price;
import com.compostcollectors.compostingAPI.Service;
import com.compostcollectors.persistence.CompostingAPIDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Represents the ReportingData class
 * @author npeck
 */
@WebServlet(urlPatterns = {"/reportingData"})
public class ReportingData extends HttpServlet {
    /**
     * doGet method
     * Accesses the API for com.Posting
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CompostingAPIDao composter = new CompostingAPIDao();
        Material materialDetail;
        Period periodDetail;
        Price priceDetail;
        Service serviceDetail;
        materialDetail = composter.getMaterialDetailById();
        periodDetail = composter.getPeriodDetailById();
        serviceDetail = composter.getServiceDetailById();
        priceDetail = composter.getPriceDetailById();
        request.setAttribute("materialDetail", materialDetail);
        request.setAttribute("serviceDetail", serviceDetail);
        request.setAttribute("periodDetail", periodDetail);
        request.setAttribute("priceDetail", priceDetail);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/reportingResults.jsp");
        dispatcher.forward(request, response);
    }
}
