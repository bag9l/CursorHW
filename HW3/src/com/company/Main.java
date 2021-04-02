package com.company;

import com.company.Part1.Shape;
import com.company.Part1.Shapes.*;
import com.company.Part2.*;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1
        Shape shape[];
        shape = new Shape[]{new Triangle(1, 0, 8, -2, 3, 5),
                new Rectangle(20, 32, 10, 20),
                new Circle(25, -25, 10),
                new SquarePyramid(13, 17, -2, 10, 25),
                new Cuboid(22, 0, 8, 10, 6, 8),
                new Sphere(10, 15, -2, 15)};

        for (Shape shape1 : shape) {
            System.out.println();
            System.out.println(shape1.toString());
        }


        // 2
        Product.setLocalTime(new Date());

        Product sausage = new FoodProduct("Cigarettes", 60, new Date(122, 1, 30), 12, AgeRestriction.TEENAGER);
        Product bear = new FoodProduct("Bear",
                24.99,
                new Date(121, 12, 30),
                39,
                AgeRestriction.ADULT);
        Product boxOfCandies = new Computer("Computer", 18000, 24, 2);
        Product iceCream = new FoodProduct("Ice cream",
                22,
                new Date(121, 3, 21),
                8,
                AgeRestriction.TEENAGER);

        List<Product> productList = List.of(
                new FoodProduct("Sausage",
                        50,
                        new Date(121, 6, 10),
                        0,
                        AgeRestriction.NONE),
                new FoodProduct("Bear",
                        24.99,
                        new Date(121, 12, 30),
                        39,
                        AgeRestriction.ADULT),
                new Computer("Computer",
                        18000,
                        24,
                        2),
                new FoodProduct("Ice cream",
                        22,
                        new Date(121, 3, 21),
                        8,
                        AgeRestriction.TEENAGER),
                new FoodProduct("Box of candies",
                        180,
                        new Date(121, 4, 10),
                        5,
                        AgeRestriction.NONE),
                new FoodProduct("Cheeps",
                        60,
                        new Date(121, 4, 12),
                        12,
                        AgeRestriction.TEENAGER),
                new FoodProduct("Cigarettes",
                        65,
                        new Date(122, 1, 30),
                        12,
                        AgeRestriction.TEENAGER));

        Customer customer = new Customer("Kolya", 25, 10);
        PurchaseManager purchaseManager = new PurchaseManager();


        for (Product product : productList) {
            try {
                purchaseManager.processPurchases(product, customer);
            } catch (SomeException exception) {
                System.out.println(exception.getMessage());
                break;
            }
        }
    }
}
