package main.java.dao.DB;

import main.java.dao.OrderDao;
import main.java.model.DeliveryStatusOrder;
import main.java.model.Order;
import main.java.model.UserModel;

import java.util.HashSet;
import java.util.stream.Collectors;

public class OrderDB implements OrderDao {
    private static OrderDB orderDB;
    private static HashSet<Order> ordersDB = new HashSet<>();

    public static OrderDB getOrderDB() {
        if (orderDB == null) {
            orderDB = new OrderDB();
        }
        return orderDB;
    }

    private OrderDB() {
    }


    public void addOrderDB(Order order) {
        ordersDB.add(order);
    }

    public void showListAllOrder() {
        System.out.println(ordersDB.toString());
    }

    public void showListOrderUser(UserModel user) {
        ordersDB.stream()
                .filter(value -> value.getCustomerId() == user.getUserID())
                .forEach(System.out::print);
    }

    public void changeDeliveryStatusOrderAdmin(long idOrder, DeliveryStatusOrder deliveryStatusOrder) {
        ordersDB.stream()
                .filter(order -> order.getId() == idOrder)
                .peek(order -> {
                    if (deliveryStatusOrder == DeliveryStatusOrder.CONFIRMED) {
                        order.orderConfirmed();
                    }
                    if (deliveryStatusOrder == DeliveryStatusOrder.CANCELLED) {
                        order.orderCancelled();
                    }
                })
                .collect(Collectors.toSet());
    }

    public void cancelDeliveryStatusOrderUser(long idOrder) {
        ordersDB.stream()
                .filter(order -> order.getId() == idOrder)
                .peek(Order::orderCancelledUser)
                .collect(Collectors.toSet());
    }


}
