package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String url = "jdbc:mysql://localhost:3306/usersdb";
    private static final String userName = "root";
    private static final String password = "2110";
    private static Connection connection;
    private static SessionFactory sessionFactory;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = new Configuration()
                    .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect")
                    .setProperty("hibernate.connection.url", url)
                    .setProperty("hibernate.connection.username", userName)
                    .setProperty("hibernate.connection.password", password)
                    .setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver")
                    .setProperty("show_sql", "true")
                    .setProperty("hibernate.hbm2ddl.auto", "create-drop")
                    .addAnnotatedClass(User.class)
                    .buildSessionFactory();
        }
        return sessionFactory;
    }
}
