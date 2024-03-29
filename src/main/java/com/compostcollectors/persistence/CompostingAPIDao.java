package com.compostcollectors.persistence;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.compostcollectors.compostingAPI.Material;
import com.compostcollectors.compostingAPI.Period;
import com.compostcollectors.compostingAPI.Price;
import com.compostcollectors.compostingAPI.Service;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * CompostingAPIDao class
 * This class represents the Composting API access point for an individual service.
 */
public class CompostingAPIDao {
    /**
     * getService
     * Method that connects to an API endpoint, and returns a specific service description
     * @return service - A specific service from the composting API.
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

    /**
     * method getServiceDetailById
     * Access the com.Posting API endpoint for Services by id.
     * @return serviceDetail
     */
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

    /**
     * getMaterialDetailById
     * Accesses the com.Posting API endpoint for Materials based on an id.
     * @return materialDetail
     */
    public Material getMaterialDetailById() {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("http://compostingapi-env.eba-x3jcxyuh.us-east-2.elasticbeanstalk.com/composting/materialsV2/4/json");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Material materialDetail = null;
        try {
            materialDetail = mapper.readValue(response, Material.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return materialDetail;
    }

    /**
     * getPeriodDetailById method
     * Accesses the com.Posting API endpoint for Periods of time based on an id.
     * @return PeriodDetail
     */
    public Period getPeriodDetailById() {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("http://compostingapi-env.eba-x3jcxyuh.us-east-2.elasticbeanstalk.com/composting/periodsV2/8/json");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Period periodDetail = null;
        try {
            periodDetail = mapper.readValue(response, Period.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return periodDetail;
    }

    /**
     * getPriceById method
     * Accesses the com.Posting API endpoint for Prices based on an id.
     * @return priceDetail
     */
    public Price getPriceDetailById() {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("http://compostingapi-env.eba-x3jcxyuh.us-east-2.elasticbeanstalk.com/composting/pricesV2/2/json");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Price priceDetail = null;
        try {
            priceDetail = mapper.readValue(response, Price.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return priceDetail;
    }

}
