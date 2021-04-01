package com.company.Part1.Shapes;

import com.company.Part1.SpaceShape;

public class Cuboid extends SpaceShape {
    private int width;
    private int height;
    private int depth;

    public Cuboid(int x, int y, int z, int width, int height, int depth) {
        setArraySize(1);
        this.x[0] = x;
        this.y[0] = y;
        this.z[0] = z;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public float getArea() {
        float backArea = width * depth;
        float sideArea = depth * height;
        float frontArea = height * width;
        return 2 * (backArea + sideArea + frontArea);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid" + "\nVertex coordinates: "
                + "\n\tx = " + x[0] + "\n\ty = " + y[0] + "\n\tz = " + z[0]
                + "\nArea = " + getArea() + "\nVolume = " + getVolume();
    }

}
