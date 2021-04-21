package main.java.model.person;

import main.java.model.UserRoles;

public class UserModel extends Person {

    public UserModel(String userName, String password, boolean active, String name) {
        super(userName, password, UserRoles.USER, active, name);
    }
}


