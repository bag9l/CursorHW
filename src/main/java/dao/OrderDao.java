package main.java.dao;

import main.java.model.DeliveryStatusOrder;
import main.java.model.Order;
import main.java.model.person.Person;

public interface OrderDao {

    void addOrderDB(Order order);

    void showListAllOrder();

    void showListOrderUser(Person user);

    void changeDeliveryStatusOrderAdmin(long idOrder, DeliveryStatusOrder deliveryStatusOrder);

    void cancelDeliveryStatusOrderUser(long idOrder);

}
