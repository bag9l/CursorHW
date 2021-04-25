package main.java;

import main.java.model.User;

public class Session {

    private static User currentUser = null;

    public static User getCurrentUser() {
        return currentUser;
    }

    public static void loginUser(User user) {
        currentUser = user;
    }

    public static void logoutUser() {
        currentUser = null;
    }
}
