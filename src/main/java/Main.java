package main.java;

import main.java.dao.impl.UserDao;
import main.java.entity.user.UserEntity;
import main.java.view.impl.LoginMenu;

import static main.java.entity.user.UserRoles.USER;

public class Main {
    public static void main(String[] args) {
        // ============= User test
        UserEntity testUser1 = new UserEntity(1, "Oleksandr", "sasha", "123", USER, true);
        UserEntity testUser2 = new UserEntity(2, "Max", "Max", "123", USER, true);

        UserDao userDao = new UserDao();
        userDao.saveUser(testUser1);
        userDao.saveUser(testUser2);
        System.out.println(userDao.getUserById(1));
        System.out.println(userDao.getUserById(2));
        userDao.removeUser(1);
        System.out.println(userDao.getUserById(1));
        System.out.println(userDao.getUserById(2));
        // ============= end User test


        new LoginMenu().show();


    }


}
