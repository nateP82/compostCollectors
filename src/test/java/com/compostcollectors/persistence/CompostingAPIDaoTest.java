package com.compostcollectors.persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * CompostingAPIDaoTest class
 * This class tests the return data from the composting API
 */
public class CompostingAPIDaoTest {
    private final Logger logger = LogManager.getLogger(this.getClass());
    @Test
    public void testCompostingAPIJSON() throws Exception {
        logger.info("Running the JSON api access point test");
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("http://compostingapi-env.eba-x3jcxyuh.us-east-2.elasticbeanstalk.com/composting/servicesV1/json");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        assertEquals("???", response);
    }
}
