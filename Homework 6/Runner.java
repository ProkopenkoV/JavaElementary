package com.hillel.prokopenko.javaelementary;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        Car[] cars = {
                new ElectricCar(100000, 170, 10),
                new Truck(200000, 70, 120, 20000),
                new Bus(150000, 45, 150, 1)};

        TaxiPark tp = new TaxiPark(cars);
        System.out.println("ALL CHARACTERISTICS OF CARS FROM A TAXI FLEET: \n" + tp);
        System.out.println("1. THE COST OF CARS IN A TAXI FLEET: " + tp.calculateCost());
        System.out.println("\n2. SORT FLEET CARS BY FUEL CONSUMPTION:");
        System.out.println(tp);

        System.out.println("3.VEHICLE(S) IN THE COMPANY THAT MATCH THE SPECIFIED RANGE OF SPEED PARAMETERS: ");
        System.out.println(Arrays.toString(tp.findCarsBySpeedRange(160, 200)));
    }
}
