package com.compostcollectors.controller;

import com.compostcollectors.entity.User;
import com.compostcollectors.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * method doPost
     * Checks if the user already exists in the database and adds them if they do not.
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("In the doGet method for updating a user account.");
        GenericDao genericDao = new GenericDao(User.class);
        request.getParameter("submit");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        int binWeight = 0;
        User composter = new User(firstName, lastName, username, email, password, address, binWeight);
        genericDao.insert(composter);
        request.setAttribute("user", composter);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/accountUpdateSuccess.jsp");
        dispatcher.forward(request, response);
    }
}
