package com.compostcollectors.controller;

import com.compostcollectors.persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * UpdateAccount servlet
 * This class represents the update account class
 * @author npeck
 */
@WebServlet(
        urlPatterns = {"/updateAccount"}
)
public class UpdateAccount extends HttpServlet {
    /**
     * method doGet
     * Method finds and returns a specific user from the database
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        UserDao userDao = new UserDao();
//        request.getParameter("submit");
//        request.setAttribute("users", userDao.getUsersByLastName(request.getParameter("searchUsers")));
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/viewAccountResults.jsp");
//        dispatcher.forward(request, response);
    }
}
