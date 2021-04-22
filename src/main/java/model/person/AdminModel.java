package main.java.model.person;

import main.java.dao.impl.AdminDAOImpl;
import main.java.model.*;

public class AdminModel extends Person {
    private UserRoles userRoles;
    AdminDAOImpl adminDAO = new AdminDAOImpl();

    public AdminModel(String userName, String password, boolean active, String name) {
        super(userName, password, UserRoles.ADMIN, active, name);
    }

    public void makeAdmin(Person user) {
        adminDAO.updateUserToAdmin(user);
    }

    public Order changeOrderStatus(Order order, DeliveryStatusOrder statusOrder) {
        order.setDeliveryStatusOrder(statusOrder);
        return order;
    }

    public Person blockUser(Person user) {
        user.setActive(false);
        return user;
    }

    public Product createProduct(String name, double price, int amountInStock, ProductCategory category) {
        return new Product(name, price, amountInStock, category);
    }

    public void showInfoAboutProduct(Product product) {
        System.out.println(product.toString());
    }
}



