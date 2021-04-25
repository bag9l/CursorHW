package main.java.dao.impl;

import main.java.dao.DB.UserDB;
import main.java.dao.UserDao;
import main.java.model.person.Person;

import java.util.Optional;
import java.util.stream.Collectors;

public class UserDaoImpl implements UserDao<Person> {

    @Override
    public void saveUser(Person userModel) {
        if (isUserInDatabase(userModel.getUserID())) {
            System.out.println("User already exists in the database.");
        } else {
            try {
                UserDB.getUserDB().add(userModel);
            } catch (Exception e) {
                System.out.println("Problem with adding a User to the database.");
            }
        }
    }

    @Override
    public Person getUserById(long userID) {
        Person person =  null;
        Optional<Person> optionalPerson = Optional.empty();
        if (isUserInDatabase(userID)) {
            try {
                optionalPerson = UserDB.getUserDB().stream()
                        .filter(userModel -> userModel.getUserID() == userID)
                        .findFirst();
            } catch (Exception e) {
                System.out.printf("Problem with getting a User with id = %s from the database", userID);
            }
        if (optionalPerson.isPresent()) {
            person = optionalPerson.get();
        }
        } else {
            System.out.printf("User with id = %s is not found.", userID);
        }
        return person;
    }


    @Override
    public void removeUser(long userID) {
        if (isUserInDatabase(userID)) {
            boolean userIsRemoved = false;
            try {
                userIsRemoved = UserDB.getUserDB().remove(getUserById(userID));
            } catch (Exception e) {
                System.out.printf("Problem during removing a user with id = %s from the database", userID);
            }
            if (userIsRemoved) {
                System.out.printf("User with id = %s was removed.", userID);
            }
        } else {
            System.out.printf("User with id = %s not found.", userID);
        }
    }

    @Override
    public Person getUserByUsername(String userName) {
        Person userModelRez = null;
        if (UserDB.getUserDB().stream().anyMatch(userModel -> userModel.getUserName().contains(userName))) {
            userModelRez = UserDB.getUserDB().stream().filter(userModel -> userModel.getUserName().equals(userName))
                    .collect(Collectors.toList()).get(0);
        } else {
            System.out.printf("User with username = %s not found.", userName);
        }
        return userModelRez;
    }

    public boolean isUserByUsername(String userName){
        return UserDB.getUserDB().stream().anyMatch(userModel -> userModel.getUserName().equals(userName));
    }

    private boolean isUserInDatabase(long userID) {
        return UserDB.getUserDB().stream().anyMatch(userModel -> userModel.getUserID() == userID);
    }
}
