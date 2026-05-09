package com.shop.main;

// We "import" the DBConnection class so this file can see it
import com.shop.database.DBConnection; 
import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        System.out.println("--- Starting Database Test ---");
        
        // We call the 'getConnection' method we wrote in the other file
        Connection conn = DBConnection.getConnection();

        if (conn != null) {
            System.out.println("BINGO! Your Java code and Oracle Database are connected.");
        } else {
            System.out.println("FAILURE: The connection is empty. Check your password.");
        }
    }
}