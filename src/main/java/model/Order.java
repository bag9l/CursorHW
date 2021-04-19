package main.java.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
        private static int counter = 1;

        private int id;
        private Date date;
        private int customerId;
        private List<Product> listOfProduct = new ArrayList<>();
        private double sum;
        private DeliveryStatusOrder deliveryStatusOrder;

        public Order(int customerId, Product product) {
            this.id = counter++;
            this.date = new Date();
            this.customerId = customerId;
            this.listOfProduct.add(product);
            this.sum = product.getPrice();
            this.deliveryStatusOrder = DeliveryStatusOrder.UNCONFIRMED;
        }

    public int getId() {
        return id; }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getListOfProduct() {
        return listOfProduct;
    }

    public void setListOfProduct(List<Product> listOfProduct) {
        this.listOfProduct = listOfProduct;
    }

    public DeliveryStatusOrder getDeliveryStatusOrder() {
        return deliveryStatusOrder;
    }

    public void setDeliveryStatusOrder(DeliveryStatusOrder deliveryStatusOrder) {
        this.deliveryStatusOrder = deliveryStatusOrder;
    }

    @Override
    public String toString() {
        return "\nOrder{" +
                "id=" + id +
                ", date=" + date +
                ", customerId=" + customerId +
                ", listOfProduct=" + listOfProduct +
                ", sum=" + sum +
                ", deliveryStatusOrder=" + deliveryStatusOrder +
                '}';
    }
}
