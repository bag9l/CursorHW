package com.company;

import com.company.bikeFactory.BikeFactory;
import com.company.skateFactory.SkateFactory;

public class AbstractFactory {
    public Factory createFactory(String typeOfFactory) {
        switch (typeOfFactory) {
            case "bike factory":
                return new BikeFactory();
            case "skate factory":
                return new SkateFactory();
            default:
                return null;
        }
    }
}
