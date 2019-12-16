package com.hillel.prokopenko.javaelementary;


public class Bus extends Car {
    private int numberOfFloors;


    public Bus(int price, int fuelConsumption, int maxSpeed, int numberOfFloors) {
        super(price, fuelConsumption, maxSpeed);
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfSeats() {
        return numberOfFloors;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfFloors = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Bus has the following characteristics: " +
                "Number of floors=" + numberOfFloors+"; Price = "+getPrice() +"; Fuel consumption= "+getFuelConsumption()+"; Max speed= "+getMaxSpeed();
    }

}
