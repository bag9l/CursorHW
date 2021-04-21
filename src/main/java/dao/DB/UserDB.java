package main.java.dao.DB;

import main.java.model.person.Person;

import java.util.HashSet;

public class UserDB {
    private HashSet<Person> userDB = new HashSet<>();

    public UserDB() {
    }

    public HashSet<Person> getUserDB() {
        return userDB;
    }
}
