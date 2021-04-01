package com.company.Part1;

import com.company.Part1.Interfaces.AreaMeasurable;
import com.company.Part1.Interfaces.PerimeterMeasurable;

public class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    @Override
    public float getPerimeter() {
        return 0;
    }

    @Override
    public float getArea() {
        return 0;
    }
}
