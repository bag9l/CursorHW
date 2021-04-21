package main.java;

import main.java.dao.impl.UserDaoImpl;
import main.java.model.person.Person;
import main.java.model.person.UserModel;
import main.java.view.impl.LoginMenu;

public class Main {
    public static void main(String[] args) {
        // ============= User test
        Person testUser1 = new UserModel("Sasha", "123", true, "Oleksandr");
        Person testUser2 = new UserModel("Max", "123", true, "Maksym");

        UserDaoImpl userDaoImpl = new UserDaoImpl();
        userDaoImpl.saveUser(testUser1);
        userDaoImpl.saveUser(testUser2);
        System.out.println(userDaoImpl.getUserById(1));
        System.out.println(userDaoImpl.getUserById(2));
        userDaoImpl.removeUser(1);
        System.out.println(userDaoImpl.getUserById(1));
        System.out.println(userDaoImpl.getUserById(2));
        System.out.println(userDaoImpl.getUserByUsername("Sasha"));
        System.out.println(userDaoImpl.getUserByUsername("Max"));

        // ============= end User test


        new LoginMenu().show();


    }


}
