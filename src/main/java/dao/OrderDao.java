package main.java.dao;

import main.java.model.Order;

import java.util.List;

public interface OrderDao {

    void createOrder(Order order);

    Order getOrderById(String orderId);

    void updateOrder(Order order);

    List<Order> getAllOrders();

    List<Order> getUserOrders(String userId);

    void cancelDeliveryStatusOrderUser(long idOrder);
}
