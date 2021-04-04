package com.company.part1.shapes;

import com.company.part1.SpaceShape;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Sphere extends SpaceShape {
    private int radius;

    public Sphere(int x, int y, int z, int radius) {
        setArraySize(1);
        this.x[0] = x;
        this.y[0] = y;
        this.z[0] = z;
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (4 * PI * pow(radius, 2));
    }

    @Override
    public double getVolume() {
        return (float) (4 / 3 * (PI * pow(radius, 3)));
    }

    @Override
    public String toString() {
        return "Sphere" + "\nVertex coordinates: "
                + "\n\tx = " + x[0] + "\n\ty = " + y[0] + "\n\tz = " + z[0]
                + "\nArea = " + getArea() + "\nVolume = " + getVolume();
    }
}
