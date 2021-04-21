package com.company.skateFactory.skates;

import com.company.skateFactory.Skate;

public class ElectricSkateboard implements Skate {
    @Override
    public void drive() {
        System.out.println("drive electric skateboard");
    }
}
