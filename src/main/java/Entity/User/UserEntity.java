package main.java.Entity.User;

public class UserEntity {
    private long id;
    private String name;
    private String userName;
    private String password;
    private UserRoles userRoles;
    private boolean active;

    public UserEntity(long id, String name, String userName, String password, UserRoles userRoles, boolean active) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.userRoles = userRoles;
        this.active = active;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", userRoles=" + userRoles +
                ", active=" + active +
                '}';
    }
}
