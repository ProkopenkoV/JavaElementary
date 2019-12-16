package com.hillel.prokopenko.javaelementary;


public class Car {
    private int price;
    private int fuelConsumption;
    private int maxSpeed;

    public Car(int price, int fuelConsumption, int maxSpeed) {
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    public Car(int price, int maxSpeed) {
        this(price, 0, maxSpeed);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

