package com.compostcollectors.persistence;

import java.io.IOException;
import java.util.Properties;

/**
 * This interface contains a default method that can be used anywhere a Properties
 * object is needed to be loaded.
 * @author Eric Knapp
 *
 */
public interface PropertiesLoader {

    /**
     * This default method will load a properties file into a Properties instance
     * and return it.
     * @param propertiesFilePath a path to a file on the java classpath list
     * @return a populated Properties instance or an empty Properties instance if
     * the file path was not found.
     * @throws IOException - exception thrown for unreadable properties file
     * @throws Exception - exception error thrown if there is a general issues loading the properties file
     */
    default Properties loadProperties(String propertiesFilePath) throws IOException, Exception {
        Properties properties = new Properties();

            properties.load(this.getClass().getResourceAsStream(propertiesFilePath));

        return properties;
    }
}
