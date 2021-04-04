package com.company.part2;

import java.util.Date;

public class PurchaseManager {

    public static void processPurchases(Product product, Customer customer) {
        if (product instanceof FoodProduct) {
            if (isOutOfStock((FoodProduct) product)) {
                throw new SomeException(product.getName() + ", is not in stock");
            } else if (isExpired((FoodProduct) product)) {
                throw new SomeException(product.getName() + ", has expired");
            } else if (!isEnoughMoney((FoodProduct) product, customer)) {
                throw new SomeException(customer.getName() + ", you do not have enough money");
            } else if (!isAllowed((FoodProduct) product, customer)) {
                throw new SomeException(customer.getName() + ", you are not an adult");
            } else {
                product.setQuantity(product.getQuantity() - 1);
                customer.setBalance(customer.getBalance() - product.getPrice());
            }
        } else {
            product.setQuantity(product.getQuantity() - 1);
            customer.setBalance(customer.getBalance() - product.getPrice());
        }
    }

    private static boolean isOutOfStock(FoodProduct product) {
        if (product.getQuantity() == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isExpired(FoodProduct product) {
        if (product.getExpirationDate().getTime() <= new Date().getTime()) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isEnoughMoney(FoodProduct product, Customer customer) {
        if (product.getPrice() > customer.getBalance()) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean isAllowed(FoodProduct product, Customer customer) {
        if (product.getAgeRestriction() == AgeRestriction.TEENAGER && customer.getAge() < 18) {
            return false;
        } else {
            return true;
        }
    }
}
