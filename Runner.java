package com.hillel.prokopenko.javaelementary;

public class Runner {

    public static void main(String[] args) {
        CarProcessor carPProcessor = new CarProcessor();
        Car[] cars = new Car[]{new Car(1, 2010, 41000, "BMW", "X3", "AX 0080 CB", "Brown"),
                new Car(2, 1971, 1000, "Zhiguli", "VAZ-2101 aka Kopeyka", "BI 3128 AB", "White"),
                new Car(3, 2005, 10000, "Volkswagen", "Golf", "AX 1280 МА", "Black"),
                new Car(4, 2019, 35000, "BMW", "X5", "AE 1230 BB", "Brown"),
                new Car(5, 2012, 80000, "Jaguar", "XF", "BA 1162 АI", "White"),
                new Car(6, 2005, 50000, "Volkswagen", "B7", "AE 9152 EA", "Black"),
                new Car(7, 2005, 90000, "Jaguar", "F-TYPE", "AA 7771 МА", "Black")};


        System.out.println("The requested brand of machine has the following series of characteristics: ");
        carPProcessor.printCarByBrand(cars, "Zhiguli");
        System.out.println(" ");
        System.out.println("A given model of a machine with a specified lifetime has the following characteristics: ");
        carPProcessor.printCarByModel(cars, "F-TYPE", 2);
        System.out.println(" ");
        System.out.println("List of cars entered year of manufacture with a price higher than specified: ");
        carPProcessor.printCarByYear(cars, 2010, 2000);
        System.out.println(" ");

        CarProcessor carPProcessorForOverloadedMethods = new CarProcessor(cars);
        System.out.println("The requested brand of machine has the following series of characteristics: ");
        carPProcessorForOverloadedMethods.printCarByBrand("Volkswagen");
        System.out.println(" ");
        System.out.println("A given model of a machine with a specified lifetime has the following characteristics: ");
        carPProcessorForOverloadedMethods.printCarByModel("B7", 3);
        System.out.println(" ");
        System.out.println("List of cars entered year of manufacture with a price higher than specified: ");
        carPProcessor.printCarByYear(1980, 60000);
    }
}
