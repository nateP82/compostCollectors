package com.compostcollectors.persistence;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import com.compostcollectors.compostingAPI.Service;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CompostingAPIDao {
    Service getService() {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("http://compostingapi-env.eba-x3jcxyuh.us-east-2.elasticbeanstalk.com/composting/servicesV2/4/json");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Service service = null;
        try {
            service = mapper.readValue(response, Service.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return service;
    }

}
