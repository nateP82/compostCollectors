package com.compostcollectors.persistence;

import com.compostcollectors.entity.PickupService;
import com.compostcollectors.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PickupServiceDaoTest {
    private final Logger logger = LogManager.getLogger(this.getClass());

    GenericDao genericDao;

    /**
     * setUp test method
     * Run before each test, this method instantiates a new PickupServiceDao
     */
    @BeforeEach
    void setUp() {
        logger.info("Running setup before each test");
        genericDao = new GenericDao(PickupService.class);
        com.compostcollectors.test.util.Database database = com.compostcollectors.test.util.Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * test method getAllPickupServicesSuccess
     * test that checks for the expected number of pickupServices returned by the method.
     */
    @Test
    void getAllPickupServicesSuccess() {
        logger.info("Running getAllPickupServices Test");
        List<PickupService> pickupServices = genericDao.getAll();
        assertEquals(5, pickupServices.size());
    }
    /**
     * test that verifies the correct pickupService is returned when given a certain id
     */
    @Test
    void getPickupServiceByIdSuccess() {
        logger.info("Running getPickupServiceById test");
        PickupService retrievedPickupService = (PickupService) genericDao.getById(2);
        assertNotNull(retrievedPickupService);
        assertEquals("Replacement bin requested", retrievedPickupService.getDescription());
    }
    /**
     * Verify successful insert of a pickupService
     */
    @Test
    void insertSuccess() {
        logger.info("Running insertPickupService test");
        UserDao userDao = new UserDao();
        User user = userDao.getUserById(1);
        PickupService newPickupService = new PickupService("Requesting third bin", "1029 street", LocalDate.parse("2023-03-14"), user);
        user.addPickupService(newPickupService);
        int id = genericDao.insert(newPickupService);
        assertNotEquals(0,id);
        PickupService insertedPickupService = (PickupService) genericDao.getById(id);
        assertTrue(insertedPickupService.equals(newPickupService));
    }
    /**
     * Verify successful delete of pickupService
     */
    @Test
    void deleteSuccess() {
        logger.info("Running deletePickupService test");
        genericDao.delete(genericDao.getById(3));
        assertNull(genericDao.getById(3));
    }
    /**
     * Verifies that a pickupService can be successfully updated
     */
    @Test
    void updateSuccess() {
        logger.info("Running updatePickupService test");
        String pickupDescription = "Alternate Day for pickup requested";
        PickupService pickupServiceToUpdate = (PickupService) genericDao.getById(3);
        pickupServiceToUpdate.setDescription(pickupDescription);
        genericDao.saveOrUpdate(pickupServiceToUpdate);
        PickupService retreivedPickupService = (PickupService) genericDao.getById(3);
        String newServiceDetails = retreivedPickupService.getDescription();
        logger.debug("Retrieved pickup service", retreivedPickupService);
        assertEquals(pickupDescription, newServiceDetails);
    }
    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        logger.info("Running getByPropertyEqual test");
        List<PickupService> pickupServices = genericDao.getByPropertyEqual("description", "Replacement bin requested");
        assertEquals(1, pickupServices.size());
        assertEquals(2, pickupServices.get(0).getId());
    }
    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        logger.info("Running getByPropertyLike test");
        List<PickupService> pickupServices = genericDao.getByPropertyLike("description", "bin");
        assertEquals(3, pickupServices.size());
    }
}
