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
    PickupServiceDao dao;

    /**
     * setUp test method
     * Run before each test, this method instantiates a new PickupServiceDao
     */
    @BeforeEach
    void setUp() {
        logger.info("Running setup before each test");
        dao = new PickupServiceDao();
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
        List<PickupService> pickupServices = dao.getAllPickupServices();
        assertEquals(6, pickupServices.size());
    }
    /**
     * test that verifies the correct pickupService is returned when given a certain id
     */
    @Test
    void getPickupServiceByIdSuccess() {
        logger.info("Running getPickupServiceById test");
        PickupService retrievedPickupService = dao.getPickupServiceById(2);
        assertNotNull(retrievedPickupService);
        assertEquals("Replacement bin requested", retrievedPickupService.getDescription());
    }
    /**
     * Verify successful insert of a pickupService
     */
    // TODO create insert success for pickup service. There's an issue with the constructor.
//    @Test
//    void insertSuccess() {
//        logger.info("Running insertPickupService test");
//        PickupService newPickupService = new PickupService("Requesting third bin", "1029 street", LocalDate.parse("2023-14-03"), user);
//        int id = dao.insert(newPickupService);
//        assertNotEquals(0,id);
//        PickupService insertedPickupService = dao.getPickupServiceById(id);
//        assertEquals("Requesting third bin", insertedPickupService.getDescription());
        // Could continue comparing all values, but
        // it may make sense to use .equals()
        // TODO review .equals recommendations http://docs.jboss.org/hibernate/orm/5.2/pickupServiceguide/html_single/Hibernate_PickupService_Guide.html#mapping-model-pojo-equalshashcode
//    }
    /**
     * Verify successful delete of pickupService
     */
    @Test
    void deleteSuccess() {
        logger.info("Running deletePickupService test");
        dao.delete(dao.getPickupServiceById(3));
        assertNull(dao.getPickupServiceById(3));
    }
    /**
     * Verifies that a pickupService can be successfully updated
     */
    @Test
    void updateSuccess() {
        logger.info("Running updatePickupService test");
        String pickupDescription = "Alternate Day for pickup requested";
        PickupService pickupServiceToUpdate = dao.getPickupServiceById(3);
        pickupServiceToUpdate.setDescription(pickupDescription);
        dao.saveOrUpdate(pickupServiceToUpdate);
        PickupService retreivedPickupService = dao.getPickupServiceById(3);
        assertEquals(pickupDescription, retreivedPickupService.getDescription());
    }
    /**
     * Verify successful get by property (equal match)
     */
    // TODO update this test
    @Test
    void getByPropertyEqualSuccess() {
        logger.info("Running getByPropertyEqual test");
        List<PickupService> pickupServices = dao.getByPropertyEqual("lastName", "Curry");
        assertEquals(1, pickupServices.size());
        assertEquals(3, pickupServices.get(0).getId());
    }
    /**
     * Verify successful get by property (like match)
     */
    // TODO update this test
    @Test
    void getByPropertyLikeSuccess() {
        logger.info("Running getByPropertyLike test");
        List<PickupService> pickupServices = dao.getByPropertyLike("lastName", "c");
        assertEquals(3, pickupServices.size());
    }
}
