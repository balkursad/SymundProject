package com.symund.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static{

        try {
            FileInputStream file = new FileInputStream("configuration.properties");

            properties.load(file);

            file.close();

        } catch (IOException e) {
            System.out.println("File not found on the configurationReader class.");
            throw new RuntimeException(e);
        }

    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }

}
