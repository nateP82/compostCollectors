package com.compostcollectors.controller;

import com.compostcollectors.persistence.CompostingAPIDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * AccountOverview
 * Accesses the com.PostingAPI endpoints,
 * retrieves various data.
 */
@WebServlet(urlPatterns = {"/accountOverview"}
)
public class AccountOverview extends HttpServlet {
    /**
     * doGet method
     * Performs a get request to the com.Posting API
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
