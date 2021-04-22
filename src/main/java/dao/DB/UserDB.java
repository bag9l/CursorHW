package main.java.dao.DB;

import main.java.model.person.Person;

import java.util.HashSet;

public class UserDB {
    private static HashSet<Person> userDB = new HashSet<>();

    public UserDB() {
    }

    public static HashSet<Person> getUserDB() {
        return userDB;
    }
}
