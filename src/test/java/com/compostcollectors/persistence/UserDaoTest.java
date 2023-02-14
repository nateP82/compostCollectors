package com.compostcollectors.persistence;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.compostcollectors.entity.User;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    UserDao dao;

    /**
     * setUp test method
     * Run before each test, this method instantiates a new UserDao
     */
    @BeforeEach
    void setUp() {
        dao = new UserDao();
        com.compostcollectors.test.util.Database database = com.compostcollectors.test.util.Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * test method getAllUsersSuccess
     * test that checks for the expected number of users returned by the method.
     */
    @Test
    void getAllUsersSuccess() {
        List<User> users = dao.getAllUsers();
        assertEquals(6, users.size());
    }
}
