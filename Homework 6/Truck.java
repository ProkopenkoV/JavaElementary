package com.hillel.prokopenko.javaelementary;

public class Truck extends Car{
    private int bodyVolume;

    public Truck(int price, int fuelConsumption, int maxSpeed, int bodyVolume) {
        super(price, fuelConsumption, maxSpeed);
        this.bodyVolume = bodyVolume;
    }

    public int getLoadCapacity() {
        return bodyVolume;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.bodyVolume = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck has the following characteristics: " +
                "Body volume= " + bodyVolume+"; Price = "+getPrice() +"; Fuel consumption= "+getFuelConsumption()+"; Max speed= "+getMaxSpeed();
    }
}
