package com.company;

import com.company.bikeFactory.Bike;
import com.company.skateFactory.Skate;

public interface Factory {
    Bike createBike(String typeOfBike);
    Skate createSkate(String typeOfSkate);
}
