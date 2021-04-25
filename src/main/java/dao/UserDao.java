package main.java.dao;

import main.java.model.person.Person;

public interface UserDao<UserModel> {
    void saveUser(UserModel userModel);

    Person getUserById(long userID) throws Exception;

    void removeUser(long userID);

    UserModel getUserByUsername(String userName);

    boolean isUserByUsername(String userName);
}
