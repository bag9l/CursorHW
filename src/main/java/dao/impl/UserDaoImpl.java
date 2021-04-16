package main.java.dao.impl;

import main.java.dao.DB.UserDB;
import main.java.dao.UserDao;
import main.java.model.UserModel;

import java.util.stream.Collectors;

public class UserDaoImpl implements UserDao<UserModel> {
    UserDB userDB = new UserDB();

    @Override
    public void saveUser(UserModel userModel) {
        try {
            userDB.getUserDB().add(userModel);
        } catch (Exception e) {
            System.out.println("User already exist in database.");
        }
    }

    @Override
    public UserModel getUserById(long id) {
        UserModel userModelRez = null;
        if (userDB.getUserDB().stream().anyMatch(userModel -> userModel.getUserID() == id)) {
            try {
                userModelRez = userDB.getUserDB().stream()
                        .filter(userModel -> userModel.getUserID() == id)
                        .collect(Collectors.toList()).get(0);
            } catch (Exception e) {
                System.out.printf("User with id = %s not found.%n", id);
            }
        }
        return userModelRez;
    }


    @Override
    public void removeUser(long id) {
        if (userDB.getUserDB().stream().anyMatch(userModel -> userModel.getUserID() == id)) {
            boolean userIsRemoved = false;
            try {
                userIsRemoved = userDB.getUserDB().remove(getUserById(id));
            } catch (Exception e) {
                System.out.printf("Can't remove user with id = %s%n", id);
            }
            if (userIsRemoved) {
                System.out.printf("User with id = %s was removed.%n", id);
            }
        } else {
            System.out.printf("User with id = %s not found.%n", id);
        }
    }

    @Override
    public UserModel getUserByUsername(String userName) {
        return null;
    }
}
