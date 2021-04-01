package com.company.Part2;

import com.company.Part2.Interfaces.Expirable;

import java.util.Date;

public class FoodProduct extends Product implements Expirable {
    private Date expirationDate;
    private AgeRestriction ageRestriction;

    public FoodProduct(String name, double price, Date expirationDate, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
        this.expirationDate = expirationDate;

    }

    @Override
    public boolean isExpired() {
        if (this instanceof FoodProduct) {
            if (this.expirationDate.getTime() < new Date().getTime()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double returnMoney() {
        if (expirationDate.getDay() > getLocalTime().getDay() + 15) {
            return getPrice() * 0.7;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Product: " + getName() + "\nPrice: " + getPrice()
                + "\nShelf life: " + expirationDate.toGMTString()
                + "\nGuantity: " + getQuantity() + "\nProduct's type: " + getAgeRestriction().name();
    }
}
