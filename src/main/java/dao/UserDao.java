package main.java.dao;

public interface UserDao<UserEntity> {
    void saveUser(UserEntity userEntity);

    UserEntity getUserById(long id) throws Exception;

    void removeUser(long id);

    UserEntity getUserByUserName(String userName);
}
