package com.company.part2;

public class ElectronicsProduct extends Product {
    private int guaranteePeriod;

    public ElectronicsProduct(String name, double price, int guaranteePeriod, int quantity) {
        super(name, price, quantity);
        this.guaranteePeriod = guaranteePeriod;
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(int numberOfMonth) {
        this.guaranteePeriod = numberOfMonth;
    }

    @Override
    public String toString() {
        return "Product: " + getName() + "\nPrice: " + getPrice()
                + "\nGuaranty period: " + guaranteePeriod + " months"
                + "\nGuantity: " + getQuantity();
    }
}
