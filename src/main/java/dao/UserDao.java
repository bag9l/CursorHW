package main.java.dao;

import main.java.model.User;

public interface UserDao {

    void saveUser(User user);

    User getUserById(String userId);

    void removeUser(String userId);

    User getUserByUsername(String username);
}
