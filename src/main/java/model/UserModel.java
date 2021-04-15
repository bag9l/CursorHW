package main.java.model;


import main.java.entity.user.UserEntity;

import java.util.HashSet;


public class UserModel {
    private HashSet<UserEntity> userDB = new HashSet<>();


    public UserModel() {
    }

    public HashSet<UserEntity> getUserDB() {
        return userDB;
    }

}
