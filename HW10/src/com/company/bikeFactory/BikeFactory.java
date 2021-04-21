package com.company.bikeFactory;

import com.company.Factory;
import com.company.bikeFactory.bikes.MountainBike;
import com.company.bikeFactory.bikes.SportBike;
import com.company.skateFactory.Skate;

public class BikeFactory implements Factory {
    public Bike createBike(String typeOfBike){
        switch (typeOfBike){
            case "mountain bike": return new MountainBike();
            case "sport bike": return new SportBike();
            default: return null;
        }
    }

    @Override
    public Skate createSkate(String typeOfSkate) {
        return null;
    }
}
