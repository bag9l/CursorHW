package com.company.skateFactory;

import com.company.Factory;
import com.company.bikeFactory.Bike;
import com.company.skateFactory.skates.ElectricSkateboard;
import com.company.skateFactory.skates.Longboard;
import com.company.skateFactory.skates.PennyBoard;

public class SkateFactory implements Factory {
    public Skate createSkate(String typeOfSkate) {
        switch (typeOfSkate) {
            case "penny board":
                return new PennyBoard();
            case "longboard":
                return new Longboard();
            case "electric skateboard":
                return new ElectricSkateboard();
            default:
                return null;
        }
    }

    @Override
    public Bike createBike(String typeOfBike) {
        return null;
    }
}
