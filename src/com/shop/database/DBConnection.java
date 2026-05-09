package com.shop.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // 1. Database Credentials (Standard for Oracle XE)
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "system"; // Your Oracle username
    private static final String PASS = "your_password"; // Change this to your Oracle password

    // 2. The method to get a connection
    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Load the Oracle JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // Create the connection
            conn = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Success: Connected to Oracle Database!");
            
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Oracle Driver not found. Did you add the JAR file?");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error: Could not connect to Database. Check URL/Credentials.");
            e.printStackTrace();
        }
        return conn;
    }
