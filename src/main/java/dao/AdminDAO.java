package main.java.dao;

import main.java.model.person.Person;

public interface AdminDAO {
    void updateUserToAdmin(Person userModel);
}
