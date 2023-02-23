package com.compostcollectors.persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.compostcollectors.entity.User;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    private final Logger logger = LogManager.getLogger(this.getClass());
    UserDao dao;

    /**
     * setUp test method
     * Run before each test, this method instantiates a new UserDao
     */
    @BeforeEach
    void setUp() {
        logger.info("Running setup before each test");
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
        logger.info("Running getAllUsers Test");
        List<User> users = dao.getAllUsers();
        assertEquals(6, users.size());
    }
    /**
     * test method getUsersByLastNameSuccess
     * test that checks for the expected number of users with a given search value is returned.
     */
    @Test
    void getUsersByLastNameSuccess() {
        logger.info("Running getUsersByLastName Test");
        List<User> users = dao.getUsersByLastName("c");
        assertEquals(3, users.size());
    }
    /**
     * test that verifies the correct user is returned when given a certain id
     */
    @Test
    void getUserByIdSuccess() {
        logger.info("Running getUserById test");
        User retrievedUser = dao.getUserById(3);
        assertNotNull(retrievedUser);
        assertEquals("Barney", retrievedUser.getFirstName());
    }
    /**
     * Verify successful insert of a user
     */
    @Test
    void insertSuccess() {
        logger.info("Running insertUser test");
        User newUser = new User("Fred", "Flintstone", "fflintstone", "fflintstone@mailinator.com", "supersecret7", "1029 Street Address", 40);
        int id = dao.insert(newUser);
        assertNotEquals(0,id);
        User insertedUser = dao.getUserById(id);
        assertTrue(insertedUser.equals(newUser));
    }
    /**
     * Verify successful delete of user
     */
    @Test
    void deleteSuccess() {
        logger.info("Running deleteUser test");
        dao.delete(dao.getUserById(3));
        assertNull(dao.getUserById(3));
    }
    /**
     * Verifies that a user can be successfully updated
     */
    @Test
    void updateSuccess() {
        logger.info("Running updateUser test");
        String newLastName = "Davis";
        User userToUpdate = dao.getUserById(3);
        userToUpdate.setLastName(newLastName);
        dao.saveOrUpdate(userToUpdate);
        User retreivedUser = dao.getUserById(3);
        assertEquals(newLastName, retreivedUser.getLastName());
    }
    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        logger.info("Running getByPropertyEqual test");
        List<User> users = dao.getByPropertyEqual("lastName", "Curry");
        assertEquals(1, users.size());
        assertEquals(3, users.get(0).getId());
    }
    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        logger.info("Running getByPropertyLike test");
        List<User> users = dao.getByPropertyLike("lastName", "c");
        assertEquals(3, users.size());
    }
}
