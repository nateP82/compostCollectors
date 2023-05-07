package com.compostcollectors.controller;

import com.compostcollectors.compostingAPI.Service;
import com.compostcollectors.persistence.CompostingAPIDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
        Service serviceDetail;
        serviceDetail = composter.getServiceDetailById();
        request.setAttribute("serviceDetail", serviceDetail);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/reportingResults.jsp");
        dispatcher.forward(request, response);
    }
//
//    /**
//     * getRandomId method
//     * gets a random number for returned service records
//     * @return a number between 1 and 10 that
//     */
//    public int getRandomId() {
//        int randomIdForAPI = (int) Math.floor(Math.random());
//
//        return randomIdForAPI;
//    }
}
