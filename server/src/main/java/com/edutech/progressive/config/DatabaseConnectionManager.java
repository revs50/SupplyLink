package com.edutech.progressive.config;

import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Connection;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;
import org.springframework.stereotype.Component;


@Component
public class DatabaseConnectionManager {
private static final Properties properties = new Properties();

@Autowired
private static Environment env;
private static void loadProperties() {
    String url = env.getProperty("spring.datasource.url");
    String username=env.getProperty("spring.datasource.username");
    String password=env.getProperty("spring.datasource.password");
    properties.put("url", url);
    properties.put("username", username);
    properties.put("password", password);
}

public static Connection getConnection() throws SQLException{
    String url = (String) properties.get("url");
    String username = (String) properties.get("username");
    String password = (String) properties.get("password");
    return DriverManager.getConnection(url,username,password);
    //return DriverManager.getConnection((String)properties.get("url"),(String) properties.get("username"),(String) properties.get("password"));
}
}
    // static {
    //     loadProperties();
    // }
    
    // public static void loadProperties() {
    //     try (InputStream input = DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties")){
    //         if(input==null) {
    //             throw new RuntimeException("application.properties file not found");
    //         }
    //         properties.load(input);
    //     } catch (Exception e) {
    //         throw new RuntimeException("Fails to load database properties",e);
    //     }
    // }




