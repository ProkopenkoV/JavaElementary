package com.hillel.prokopenko.javaelementary;

public class CarProcessor {

    public Car[] arr;

    public CarProcessor(Car[] arr) {
        this.arr = arr;
    }

    public CarProcessor() {
        arr = new Car[]{};
    }

    public boolean theArrIsEmpty() {
        return arr.length == 0;
    }

    public void printCarByBrand(String mark) {
        if (!theArrIsEmpty()) {
            for (Car car : arr) {
                if (car.brand.equals(mark)) {
                    printCar(car);
                }

            }
        } else {
            inCaseOfAnEmptyArrayOfObjects();
        }
    }

    public void printCarByModel(String model, int year) {
        if (!theArrIsEmpty()) {
            for (Car car : arr) {
                int yearInWork = 2019 - car.year;
                if (car.model.equals(model) && yearInWork >= year) {
                    printCar(car);
                }
            }
        } else {
            inCaseOfAnEmptyArrayOfObjects();
        }
    }

    public void printCarByYear(int year, int price) {
        if (!theArrIsEmpty()) {
            for (Car car : arr) {
                if (car.year == year && car.price >= price) {
                    printCar(car);
                }
            }
        } else {
            inCaseOfAnEmptyArrayOfObjects();
        }
    }


    public void printCarByBrand(Car[] cars, String brand) {
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

    void inCaseOfAnEmptyArrayOfObjects() {
        System.out.println("There are no objects in this array ");
    }
}


