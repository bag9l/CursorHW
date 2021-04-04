package com.company.part2;

public class Computer extends ElectronicsProduct {

    public Computer(String name, double price, int guaranteePeriodInMonth, int quantity) {
        super(name, price, guaranteePeriodInMonth, quantity);
    }

    public double returnMoney() {
        if (getQuantity() > 1000) {
            return getPrice() * 0.95;
        } else {
            return getPrice();
        }
    }
}
