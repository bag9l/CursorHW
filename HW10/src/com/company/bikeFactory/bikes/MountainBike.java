package com.company.bikeFactory.bikes;

import com.company.bikeFactory.Bike;

public class MountainBike implements Bike {
    @Override
    public void drive() {
        System.out.println("drive mountain bike");
    }
}
