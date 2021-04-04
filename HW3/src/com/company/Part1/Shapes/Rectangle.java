package com.company.part1.shapes;

import com.company.part1.PlaneShape;

public class Rectangle extends PlaneShape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        setArraySize(1);
        this.x[0] = x;
        this.y[0] = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public float getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public float getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle" + "\nVertex coordinates: "
                + "\n\tx1 = " + x[0] + "\n\ty1 = " + y[0] + "\n\tz1 = " + z[0]
                + "\nPerimeter = " + getPerimeter()
                + "\nArea = " + getArea();
    }


}
