package main.java.DB;

import main.java.entity.user.UserEntity;

import java.util.HashSet;

public class UserDB {
    private HashSet<UserEntity> userDB = new HashSet<>();

    public UserDB() {}

    public HashSet<UserEntity> getAccessToUserDB() {
        return userDB;
    }
}
