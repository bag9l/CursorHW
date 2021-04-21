package main.java.model.person;

import main.java.model.UserRoles;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Person {
    private static final AtomicInteger count = new AtomicInteger(0);
    private long userID;
    private String userName;
    private String password;
    private UserRoles userRoles;
    private boolean active;
    private String name;

    public Person(String userName, String password, UserRoles userRoles, boolean active, String name) {
        this.userID = count.incrementAndGet();
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.name = name;
        this.userRoles = userRoles;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRoles getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(UserRoles userRoles) {
        this.userRoles = userRoles;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // User password not showed
    @Override
    public String toString() {
        return "UserID = " + userID +
                ", name = '" + name + '\'' +
                ", userName = '" + userName + '\'' +
                ", userRoles = " + getUserRoles() +
                ", active = " + active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person that = (Person) o;
        return userID == that.userID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID);
    }
}
