package com.company.part1.shapes;

import com.company.part1.PlaneShape;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends PlaneShape {
    private int radius;

    public Circle(int x, int y, int radius) {
        setArraySize(1);
        this.x[0] = x;
        this.y[0] = y;
        this.radius = radius;
    }

    @Override
    public float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public float getArea() {
        return (float) (PI * pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Circle" + "\nVertex coordinates: "
                + "\n\tx1 = " + x[0] + "\n\ty1 = " + y[0] + "\n\tz1 = " + z[0]
                + "\nPerimeter = " + getPerimeter()
                + "\nArea = " + getArea();
    }
}
