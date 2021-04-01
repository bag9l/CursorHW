package com.company;

public class Circle {
    private int radius;

    public Circle(int radius) {
        if (radius < 0) {
            radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0) {
            radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public float getArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }
}
