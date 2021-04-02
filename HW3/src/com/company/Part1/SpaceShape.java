package com.company.Part1;

import com.company.Part1.Interfaces.AreaMeasurable;
import com.company.Part1.Interfaces.VolumeMeasurable;

public class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public float getArea() {
        return 0;
    }


    public double getVolume() {
        return 0;
    }
}
