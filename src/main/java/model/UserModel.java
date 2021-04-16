package main.java.model;

import main.java.DB.UserDB;
import main.java.entity.user.UserEntity;

import java.util.HashSet;


public class UserModel {
    UserDB userDB = new UserDB();


    public UserModel() {
    }

    public HashSet<UserEntity> getUserDB() {
        return userDB.getAccessToUserDB();
    }

}
