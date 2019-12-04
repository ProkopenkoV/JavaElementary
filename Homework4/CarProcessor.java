package com.hillel.prokopenko.javaelementary;

public class CarProcessor {

    void printCarByBrand(Car[] cars, String brand) {
        for (Car car : cars) {
            if (car.brand.equals(brand)) {
                printCar(car);
            }
        }

    }

    public void printCarByModel(Car[] cars, String model, int year) {
        for (Car car : cars) {
            int lifetime = 2019 - car.year;
            if (car.model.equals(model) && lifetime >= year) {
                printCar(car);
            }
        }
    }

    public void printCarByYear(Car[] cars, int year, int price) {
        for (Car car : cars) {
            if (car.year == year && car.price >= price) {
                printCar(car);
            }
        }
    }

    void printCar(Car car) {
        System.out.println("id: " + car.id + ", brand: " + car.brand + ", model: " + car.model + ", year: " +
                car.year + ", price: " + car.price + ", color: " + car.color + ", registration number: " + car.registrationNumber);
    }
}

