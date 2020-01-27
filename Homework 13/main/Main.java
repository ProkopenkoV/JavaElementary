
package main;

import main.taxiPark.CarPark;

public class Main {
    public static void main(String[] args) {

        CarPark carPark = new CarPark();

        Properties properties= new Properties();

        properties.printSorting(carPark.sortByFuel());

        properties.printSpeed(carPark.findBySpeed(65, 160), 65, 100);

        properties.printCost(carPark.countAllCost());
    }
}