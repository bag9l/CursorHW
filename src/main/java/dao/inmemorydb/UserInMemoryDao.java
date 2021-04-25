package main.java.dao.inmemorydb;

import main.java.dao.UserDao;
import main.java.model.User;
import main.java.model.UserRole;

import java.util.HashMap;
import java.util.Map;

public class UserInMemoryDao implements UserDao {

    private final Map<String, User> users = new HashMap<>();

    private static UserDao entity;

    public static UserDao getEntity() {
        if (entity == null) {
            entity = new UserInMemoryDao();
        }
        return entity;
    }

    private UserInMemoryDao() {
        User admin = new User("admin", "admin", UserRole.ADMIN, true, "Admin");
        users.put(admin.getUserId(), admin);
    }

    @Override
    public void saveUser(User user) {
        users.put(user.getUserId(), user);
    }

    /**
     * @return {@code null} if there is no user with a given userId
     */
    @Override
    public User getUserById(String userId) {
        // TODO
        return null;
    }

    @Override
    public void removeUser(String userId) {
        // TODO
    }

    /**
     * @return {@code null} if there is no user with a given username
     */
    @Override
    public User getUserByUsername(String username) {
        // TODO
        return null;
    }
}
