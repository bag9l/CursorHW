package main.java.dao;

public interface UserDao<UserModel> {
    void saveUser(UserModel userModel);

    UserModel getUserById(long userID) throws Exception;

    void removeUser(long userID);

    UserModel getUserByUsername(String userName);
}
