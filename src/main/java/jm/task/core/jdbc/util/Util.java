package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static String url = "jdbc:mysql://localhost:3306/usersdb";
    private static String userName = "root";
    private static String password = "2110";
    public static Connection connection;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection OK");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection ERROR");
        }

        return connection;
    }
}
