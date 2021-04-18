package com.company;

import com.company.bikeFactory.Bike;
import com.company.skateFactory.Skate;

public class Main {

    public static void main(String[] args) {
        Factory bikeFactory = new AbstractFactory().createFactory("bike factory");
        Bike bike = bikeFactory.createBike("mountain bike");
        bike.drive();

        Skate skate = new AbstractFactory().createFactory("skate factory").createSkate("longboard");
        skate.drive();
    }
}
