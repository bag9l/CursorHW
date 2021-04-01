package com.company;

public class ObjectCounter {
    private static int objectCount = 0;

    public ObjectCounter() {
        objectCount++;
    }

    public int getObjectCount() {
        return objectCount;
    }
}
