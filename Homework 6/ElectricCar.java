package com.hillel.prokopenko.javaelementary;

public class ElectricCar extends Car{

    private int amountOfNoise;

    public ElectricCar(int price, int maxSpeed, int amountOfNoise) {
        super(price, maxSpeed);
        this.amountOfNoise = amountOfNoise;
    }

    public int getPowerReserve() {
        return amountOfNoise;
    }

    public void setPowerReserve(int powerReserve) {
        this.amountOfNoise = powerReserve;
    }

    @Override
    public int getFuelConsumption() {
        return 0;
    }

    @Override
    public String toString() {
        return "Electric сar has the following characteristics: " +
                "Amount of noise=" + amountOfNoise+"; Price = "+getPrice() +"; Fuel consumption= "+getFuelConsumption()+"; Max speed= "+getMaxSpeed();
    }

}
