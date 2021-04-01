package com.company.Part1;

public class Shape {
    protected int arraySize;
    protected int[] x;
    protected int[] y;
    protected int[] z;

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
        x = new int[arraySize];
        y = new int[arraySize];
        z = new int[arraySize];
    }
}
