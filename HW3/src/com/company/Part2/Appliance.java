package com.company.Part2;

public class Appliance extends ElectronicsProduct {

    public Appliance(String name, double price, int guaranteePeriodInMonth, int quantity, boolean isAvailableForPurchase) {
        super(name, price, guaranteePeriodInMonth, quantity);
    }

    public double returnMoney() {
        if (getQuantity() < 50) {
            return getPrice() * 1.05;
        } else {
            return getPrice();
        }
    }
}
