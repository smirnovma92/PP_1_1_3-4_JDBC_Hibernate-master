package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Джон", "Картер", (byte) 46);
        userService.saveUser("Джек", "Карвер", (byte) 35);
        userService.saveUser("Джеймс", "Франко", (byte) 78);
        userService.saveUser("Мут", "Мутный", (byte) 100);

        userService.removeUserById(1);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
