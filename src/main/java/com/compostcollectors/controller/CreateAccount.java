package com.compostcollectors.controller;

import com.compostcollectors.entity.User;
import com.compostcollectors.persistence.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * CreateAccount servlet
 * This class represents the create account class
 * @author npeck
 */
@WebServlet(
        urlPatterns = {"/createAccount"}
)
public class CreateAccount extends HttpServlet {
    /**
     * method doPost
     * Method inserts a new user to the database
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        User user = new User(firstName, lastName, username, email, password, address, 0);
        request.setAttribute("user", userDao.insert(user));
    }
}
