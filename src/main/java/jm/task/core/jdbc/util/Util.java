package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static String url = "jdbc:mysql://localhost:3306/usersdb";
    private static String userName = "root";
    private static String password = "2110";
    private static Connection connection;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
