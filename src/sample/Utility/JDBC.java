package sample.Utility;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class JDBC {
    private static final String protocol = "jdbc";
    private static final String vendor = ":mysql:";
    private static final String location = "//localhost/";
    private static final String databaseName = "client_schedule";
    private static final String jdbcUrl = protocol + vendor + location + databaseName + "?connectionTimeZone = SERVER"; // LOCAL
    private static final String driver = "com.mysql.cj.jdbc.Driver"; // Driver reference
    private static final String userName = "sqlUser"; // Username
    public static Connection connection;  // Connection Interface
    private static String password = "Passw0rd!"; // Password
    private static Statement statement;

    public static void openConnection() {
        try {
            Class.forName(driver); // Locate Driver
            connection = DriverManager.getConnection(jdbcUrl, userName, password); // Reference Connection object
            System.out.println("Connection successful!");
            new Toolbox().printStatementLocator("JDBC.java");
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    public static void closeConnection() {
        try {
            connection.close();
            System.out.println("Connection closed!");
            new Toolbox().printStatementLocator("JDBC.java");
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

}