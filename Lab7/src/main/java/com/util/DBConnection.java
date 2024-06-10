package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection myConnection = null;
    private static final String myURL = "jdbc:mysql://localhost:3306/lab7_csm3023"; // Correct port 3306, typo fixed
    private static final String USERNAME = "root";
    private static final String PASSWORD = "admin";
    
    public static Connection getConnection() throws ClassNotFoundException {
        if (myConnection != null) {
            return myConnection;
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); // Updated driver class name
                myConnection = DriverManager.getConnection(myURL, USERNAME, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return myConnection;
        }
    }
    
    public static void closeConnection() {
        try {
            if (myConnection != null && !myConnection.isClosed()) {
                myConnection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
