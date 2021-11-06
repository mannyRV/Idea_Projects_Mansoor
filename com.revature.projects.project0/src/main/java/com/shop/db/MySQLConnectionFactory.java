package com.shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionFactory {

    // factory-method
    public static Connection getConnection() throws SQLException {

        Connection connection = null;
        // step-1 : Install / Register JDBC driver
//        DriverManager.registerDriver(new Driver());

        // step-2 : create DB-connection with URL, username & password
        String url = "jdbc:mysql://localhost:3306/shop";
        String username = "root";
        String password = "5985ftfr";

        connection = DriverManager.getConnection(url, username, password);

        return connection;
    }
}
