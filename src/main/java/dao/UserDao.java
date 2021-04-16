package main.java.dao;

public interface UserDao<UserModel> {
    void saveUser(UserModel userModel);

    UserModel getUserById(long id) throws Exception;

    void removeUser(long id);

    UserModel getUserByUsername(String userName);
}
