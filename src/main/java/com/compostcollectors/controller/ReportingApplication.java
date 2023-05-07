package com.compostcollectors.controller;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.*;

@ApplicationPath("/reports")
public class ReportingApplication extends Application {
    //The method returns a non-empty collection with classes, that must be included in the published JAX-RS application
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add(Report.class );
        return h;
    }
}
