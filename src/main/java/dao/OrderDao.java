package main.java.dao;

import main.java.model.DeliveryStatusOrder;
import main.java.model.Order;
import main.java.model.UserModel;

public interface OrderDao {

    void addOrderDB(Order order);

    void showListAllOrder();

    void showListOrderUser(UserModel user);

    void changeDeliveryStatusOrderAdmin(long idOrder, DeliveryStatusOrder deliveryStatusOrder);

    void cancelDeliveryStatusOrderUser(long idOrder);

}
