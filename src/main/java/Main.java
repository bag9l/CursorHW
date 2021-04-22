package main.java;

import main.java.dao.DB.UserDB;
import main.java.dao.impl.UserDaoImpl;
import main.java.model.Order;
import main.java.model.Product;
import main.java.model.ProductCategory;
import main.java.model.person.AdminModel;
import main.java.model.person.Person;
import main.java.model.person.UserModel;
import main.java.view.impl.LoginMenu;

public class Main {
    public static void main(String[] args) {
        // ============= User test
        Person testUser1 = new UserModel("Sasha", "123", true, "Oleksandr");
        Person testUser2 = new UserModel("Max", "123", true, "Maksym");

        UserDaoImpl userDaoImpl = new UserDaoImpl();
        userDaoImpl.saveUser(testUser1);
        userDaoImpl.saveUser(testUser2);
//        System.out.println(userDaoImpl.getUserById(1));
//        System.out.println(userDaoImpl.getUserById(2));
//        userDaoImpl.removeUser(1);
//        System.out.println(userDaoImpl.getUserById(1));
//        System.out.println(userDaoImpl.getUserById(2));
//        System.out.println(userDaoImpl.getUserByUsername("Sasha"));
//        System.out.println(userDaoImpl.getUserByUsername("Max"));

        // ============= end User test
//        Product product1 = new Product("cheese",200, 1, ProductCategory.FOOD );
//        Product product2 = new Product("cheese",200, 1, ProductCategory.FOOD );
//        Order order1 = new Order(1,product1);
//        Order order2 = new Order(1,product2);
//        order1.addProductOfOrder(product2);
//        System.out.println(order1.getListOfProduct().toString());
//        System.out.println(order1.showOrder());

        AdminModel admin = new AdminModel("test", "123", true, "test");
        userDaoImpl.saveUser(admin);
        admin.makeAdmin(testUser1);
        System.out.println(userDaoImpl.getUserById(1));
        System.out.println(userDaoImpl.getUserById(2));
        System.out.println(userDaoImpl.getUserById(3));
        System.out.println(userDaoImpl.getUserById(4));

        new LoginMenu().show();


    }


}
