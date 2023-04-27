package com.compostcollectors.controller;

import com.compostcollectors.entity.User;
import com.compostcollectors.persistence.PropertiesLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Properties;

@WebServlet(
        urlPatterns = {"/logOut"}
)
/**
 * LogOut servlet
 * Logs out a user from the cognito service
 */
public class LogOut extends HttpServlet implements PropertiesLoader {
    Properties properties;
    private final Logger logger = LogManager.getLogger(this.getClass());
    public static String CLIENT_ID;
    public static String LOGOUT_URL;
    public static String REDIRECT_URL;
    @Override
    public void init() throws ServletException {
        super.init();
        loadProperties();
    }
    /**
     * Read in the cognito props file and get the client id and required urls
     * for authenticating a user.
     */
    // TODO This code appears in a couple classes, consider using a startup servlet similar to adv java project
    // 4 to do this work a single time and put the properties in the application scope
    private void loadProperties() {
        try {
            properties = loadProperties("/cognito.properties");
            CLIENT_ID = properties.getProperty("client.id");
            LOGOUT_URL = properties.getProperty("loginURL");
            REDIRECT_URL = properties.getProperty("redirectURL");
        } catch (IOException ioException) {
            logger.error("Cannot load properties..." + ioException.getMessage(), ioException);
        } catch (Exception e) {
            logger.error("Error loading properties" + e.getMessage(), e);
        }
    }
    /**
     * Route to the aws-hosted cognito login page.
     * @param req servlet request
     * @param resp servlet response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO if properties weren't loaded properly, route to an error page
        logger.info("In the Auth logout servlet doGet method for sign out");
        HttpSession session = req.getSession();
        User compostUser = (User) session.getAttribute("user");

        if (compostUser == null) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/logIn");
            dispatcher.forward(req, resp);
        } else {
            session.removeAttribute("user");
            String url = LOGOUT_URL + "?response_type=code&client_id=" + CLIENT_ID + "&redirect_uri=" + REDIRECT_URL;
            resp.sendRedirect(url);
        }
    }
}
