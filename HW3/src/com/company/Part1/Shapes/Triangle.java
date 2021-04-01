package com.company.Part1.Shapes;

import com.company.Part1.PlaneShape;

import static java.lang.Math.pow;

public class Triangle extends PlaneShape {
    private float a;
    private float b;
    private float c;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        setArraySize(3);
        this.x[0] = x1;
        this.x[1] = x2;
        this.x[2] = x3;
        this.y[0] = y1;
        this.y[1] = y2;
        this.y[2] = y3;
    }

    private float getSide(int x1, int y1, int x2, int y2) {
        return (float) pow(pow((x1 - x2), 2) + pow((y1 - y2), 2), 1 / 2);
    }

    @Override
    public float getPerimeter() {
        a = getSide(x[0], y[0], x[1], y[1]);
        b = getSide(x[1], y[1], x[2], y[2]);
        c = getSide(x[2], y[2], x[0], y[0]);
        return a + b + c;
    }

    @Override
    public float getArea() {
        float p = getPerimeter() / 2;
        return (float) pow(p * (p - a) * (p - b) * (p - c), 1 / 2);
    }

    @Override
    public String toString() {
        return "Triangle" + "\nVertex coordinates: "
                + "\n\tx1 = " + x[0] + "\n\ty1 = " + y[0] + "\n\tz1 = " + z[0]
                + "\n\tx2 = " + x[1] + "\n\ty2 = " + y[1] + "\n\tz2 = " + z[1]
                + "\n\tx3 = " + x[2] + "\n\ty3 = " + y[2] + "\n\tz3 = " + z[2]
                + "\nPerimeter = " + getPerimeter()
                + "\nArea = " + getArea();
    }
}
