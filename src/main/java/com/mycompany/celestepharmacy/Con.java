package com.mycompany.celestepharmacy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Con {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost/celestePharm";

        // JDBC variables for opening, closing, and managing the connection
        Connection connection = null;
        Statement statement = null;

        try {
            // Register the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(url, "root", "");

            // Do something with the connection (e.g., execute SQL queries)
            // Create a Statement object for executing SQL queries
            statement = connection.createStatement();

            // SQL query to create a new table
            String createTableQuery = "CREATE TABLE IF NOT EXISTS your_table (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT," +
                    "name VARCHAR(255) NOT NULL," +
                    "age INT" +
                    ")";

            // Execute the query to create the table
            statement.executeUpdate(createTableQuery);

            System.out.println("Table created successfully!");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Close the connection in the finally block to ensure it's always closed
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
