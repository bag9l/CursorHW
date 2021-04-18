package com.company.bikeFactory.bikes;

import com.company.bikeFactory.Bike;

public class SportBike implements Bike {
    @Override
    public void drive() {
        System.out.println("drive sport bike");
    }
}
