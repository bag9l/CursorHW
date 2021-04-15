package main.java.dao.impl;

import main.java.entity.user.UserEntity;
import main.java.model.UserModel;

import java.util.stream.Collectors;

public class UserDao implements main.java.dao.UserDao<UserEntity> {
    UserModel userModel = new UserModel();

    @Override
    public void saveUser(UserEntity userEntity) {
        try {
            userModel.getUserDB().add(userEntity);
        } catch (Exception e) {
            System.out.println("User already exist in database.");
        }
    }

    @Override
    public UserEntity getUserById(long id) {
        UserEntity userEntityRez = null;
        if (userModel.getUserDB().stream().anyMatch(userEntity -> userEntity.getId() == id)) {
            try {
                userEntityRez = userModel.getUserDB().stream()
                        .filter(userEntity -> userEntity.getId() == id)
                        .collect(Collectors.toList()).get(0);
            } catch (Exception e) {
                System.out.printf("User with id = %s not found.%n", id);
            }
        }
        return userEntityRez;
    }


    @Override
    public void removeUser(long id) {
        if (userModel.getUserDB().stream().anyMatch(userEntity -> userEntity.getId() == id)) {
            boolean userIsRemoved = false;
            try {
                userIsRemoved = userModel.getUserDB().remove(getUserById(id));
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
    public UserEntity getUserByUserName(String userName) {
        return null;
    }
}
