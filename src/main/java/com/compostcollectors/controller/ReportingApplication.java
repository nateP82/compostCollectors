package com.compostcollectors.controller;

import com.compostcollectors.compostingAPI.Material;
import com.compostcollectors.compostingAPI.Period;
import com.compostcollectors.compostingAPI.Price;
import com.compostcollectors.compostingAPI.Service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.*;

@ApplicationPath("/reporting")
public class ReportingApplication extends Application {
    //The method returns a non-empty collection with classes, that must be included in the published JAX-RS application
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add(Report.class );
        h.add(Material.class);
        h.add(Period.class);
        h.add(Price.class);
        h.add(Service.class);
        return h;
    }
}
