package com.compostcollectors.persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;


import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import static org.junit.jupiter.api.Assertions.*;

/**
 * CompostingAPIDaoTest class
 * This class tests the return data from the composting API
 */
public class CompostingAPIDaoTest {
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Test to check a successful retrievel of a service detail description
     * @throws Exception
     */
    @Test
    public void retrieveSerivceDescriptionSuccess() throws Exception {
        logger.info("Running the JSON api access point test");
        CompostingAPIDao compostDao = new CompostingAPIDao();
        String serviceDescription = compostDao.getService().getDescription();
        String returnedServiceDescription = "A guide that will show you what are compostable materials and what should not be added to your compost bin";
        assertTrue(serviceDescription.equals(returnedServiceDescription));
    }
    @Test
    public void retrieveMaterialDescriptionSuccess() throws Exception {
        logger.info("Running the JSON api access point test");
        CompostingAPIDao compostDao = new CompostingAPIDao();
        assertEquals("A guide that will show you what are compostable materials and what should not be added to your compost bin", compostDao.getService().getDescription());
    }
}
