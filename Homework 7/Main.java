package HW7;


import HW7.InterfacesForTaxi.TaxiPark;
import HW7.carsFromTaxiPark.Bus;
import HW7.carsFromTaxiPark.Car;
import HW7.carsFromTaxiPark.ElectricCar;
import HW7.carsFromTaxiPark.Truck;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Car[] cars = {
                new ElectricCar(100000, 170, 10,10),
                new Truck(200000, 70, 120, 20000),
                new Bus(150000, 45, 150, 1)};

        TaxiPark tp = new TaxiPark();
        System.out.println("ALL CHARACTERISTICS OF CARS FROM A TAXI FLEET: \n" + tp);
        System.out.println("1. THE COST OF CARS IN A TAXI FLEET: " + tp.calculateCost(cars));
        System.out.println("\n2. SORT FLEET CARS BY FUEL CONSUMPTION:");
        System.out.println(tp);

        System.out.println("3.VEHICLE(S) IN THE COMPANY THAT MATCH THE SPECIFIED RANGE OF SPEED PARAMETERS: ");
        System.out.println(Arrays.toString(tp.findCarsBySpeedRange(cars,160,200)));
    }
}
