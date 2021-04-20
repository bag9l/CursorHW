package main.java.model;

public class AdminModel extends UserModel{
    private UserRoles userRoles = UserRoles.ADMIN;

    public AdminModel(String userName, String password, boolean active, String name) {
        super(userName, password, active, name);
    }

    public AdminModel makeAdmin (UserModel user){
        return new AdminModel(user.getUserName(), user.getPassword(), user.isActive(), user.getName());
    }

    public Order changeOrderStatus(Order order, DeliveryStatusOrder statusOrder){
        order.setDeliveryStatusOrder(statusOrder);
        return order;
    }

    public UserModel blockUser (UserModel user){
        user.setActive(false);
        return user;
    }

    public Product createProduct (String name, double price, int amountInStock, ProductCategory category){
        return new Product(name,price,amountInStock,category);
    }

    public void showInfoAboutProduct(Product product){
        System.out.println(product.toString());
    }



}
