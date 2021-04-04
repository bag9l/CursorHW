package com.company.part1.shapes;

import com.company.part1.SpaceShape;

import static java.lang.Math.pow;

public class SquarePyramid extends SpaceShape {
    private int baseWidth;
    private int pyramidHeight;

    public SquarePyramid(int x, int y, int z, int baseWidth, int pyramidHeight) {
        setArraySize(1);
        this.x[0] = x;
        this.y[0] = y;
        this.z[0] = z;
        this.baseWidth = baseWidth;
        this.pyramidHeight = pyramidHeight;
    }

    private float getHeightOfSide() {
        return (float) (pow(pow(baseWidth / 2, 2) + pow(pyramidHeight, 2), 1 / 2));
    }

    @Override
    public float getArea() {
        return baseWidth * (baseWidth + 2 * getHeightOfSide());
    }

    @Override
    public double getVolume() {
        return (pow(baseWidth, 2) * 1 / 3 * pyramidHeight);
    }

    @Override
    public String toString() {
        return "Square Pyramid" + "\nVertex's coordinates:"
                + "\n\tx1 = " + x[0] + "\n\ty1 = " + y[0] + "\n\tz1 = " + z[0]
                + "\nArea = " + getArea() + "\nVolume = " + getVolume();
    }

}
