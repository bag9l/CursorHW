package com.company;

public class Car {
    private boolean isMove;
    private int speed;
    private int maxSpeed = 180;
    private boolean turnEngine;

    public Car(int speed) {
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            isMove = false;
        } else if (speed > maxSpeed) {
            this.speed = maxSpeed;
            isMove = true;
            turnEngine = true;
        } else {
            this.speed = speed;
            isMove = true;
            turnEngine = true;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public boolean startTheEngine() {
        return turnEngine = true;
    }

    public boolean stopTheEngine() {
        isMove = false;
        speed = 0;
        return turnEngine = false;
    }

    public void info() {
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Speed: " + speed);
        System.out.println("Engine turn on: " + turnEngine);
        System.out.println("Car is moving: " + isMove);
    }

}
