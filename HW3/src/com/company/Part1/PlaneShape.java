package com.company.Part1;

import com.company.Part1.Interfaces.AreaMeasurable;
import com.company.Part1.Interfaces.PerimeterMeasurable;

public class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {


    public float getPerimeter() {
        return 0;
    }


    public float getArea() {
        return 0;
    }
}
