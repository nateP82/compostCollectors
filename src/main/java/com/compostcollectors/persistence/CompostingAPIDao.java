package com.compostcollectors.persistence;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import com.compostcollectors.compostingAPI.Service;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * CompostingAPIDao class
 * This class represents the Composting API access point for an individual service.
 */
public class CompostingAPIDao {
    /**
     * getService
     * Method that connects to an API endpoint, and returns a specific service description based on an Id.
     * @return service - A specific service based on an Id.
     */
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
    public Service getServiceDetailById() {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("http://compostingapi-env.eba-x3jcxyuh.us-east-2.elasticbeanstalk.com/composting/servicesV2/8/json");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Service serviceDetail = null;
        try {
            serviceDetail = mapper.readValue(response, Service.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return serviceDetail;
    }

}
