package com.company.part2;

public class Customer {
    private String name;
    private int age;
    private double balance;
    private boolean isAdult;

    public Customer(String name, int age, double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
        if (age > 18) {
            isAdult = true;
        }
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws SomeException {
        if (age < 0) {
            throw new SomeException("Age can't be less than zero!");
        }
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
