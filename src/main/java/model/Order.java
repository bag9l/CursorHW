package main.java.model;

import main.java.service.OrderService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
        private static int counter = 1;

        private int id;
        private Date date;
        private long customerId;
        private List<Product> listOfProduct = new ArrayList<>();
        private double sum;
        private DeliveryStatusOrder deliveryStatusOrder;

        public Order(long customerId, Product product) {
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


    public void addProductOfOrder(Product product){
        this.listOfProduct.add(product);
        this.sum = sum + product.getPrice();
    }

    public void removeProductOfOrder(Product product){
        this.listOfProduct.remove(product);
    }

    public void orderConfirmed() {

        this.deliveryStatusOrder = DeliveryStatusOrder.CONFIRMED;
    }

    public void orderCancelled() {
        this.deliveryStatusOrder = DeliveryStatusOrder.CANCELLED;
    }

    public void orderCancelledUser() {

        this.deliveryStatusOrder = DeliveryStatusOrder.CANCELLED_USER;
    }


    public String showListProductOfOrder() {
        return "\nOrder " + "#" + id +
                "\nDate: " + date +
                "\nList of product: " + listOfProduct +
                "\nSum order: " + sum +
                "\nDelivery status order: " + deliveryStatusOrder;
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
