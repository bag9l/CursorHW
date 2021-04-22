package main.java.dao.impl;

import main.java.dao.AdminDAO;
import main.java.dao.DB.UserDB;
import main.java.model.person.AdminModel;
import main.java.model.person.Person;

public class AdminDAOImpl implements AdminDAO {

    @Override
    public void updateUserToAdmin(Person userModel) {
        if (UserDB.getUserDB().stream().anyMatch(db -> db.getUserID() == userModel.getUserID())) {
            AdminModel admin = new AdminModel(userModel.getUserName(), userModel.getPassword(), userModel.isActive(), userModel.getName());
            UserDaoImpl userDao = new UserDaoImpl();
            userDao.removeUser(userModel.getUserID());
            UserDB.getUserDB().add(admin);
        }
    }
}
