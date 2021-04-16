package main.java.dao.DB;

import main.java.model.UserModel;

import java.util.HashSet;

public class UserDB {
    private HashSet<UserModel> userDB = new HashSet<>();

    public UserDB() {
    }

    public HashSet<UserModel> getUserDB() {
        return userDB;
    }
}
