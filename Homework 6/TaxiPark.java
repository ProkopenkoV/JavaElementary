package com.hillel.prokopenko.javaelementary;


import java.util.Arrays;

public class TaxiPark {
    private Car[] cars;

    public TaxiPark(Car[] car) {
        this.cars = car;
    }

    public int calculateCost() {
        int cost = 0;
        for (Car car : cars) {
            cost += car.getPrice();
        }
        return cost;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public void sortByFuelConsumption() {
        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[j].getFuelConsumption() < cars[i].getFuelConsumption()) {
                    Car temp = cars[j];
                    cars[j] = cars[i];
                    cars[i] = temp;
                }

            }

        }
    }

    public Car[] findCarsBySpeedRange(int minSpeed, int maxSpeed) {
        Car[] res = {};
        for (Car car : getCars()) {
            if (car.getMaxSpeed() >= minSpeed && car.getMaxSpeed() <= maxSpeed) {
                res = extendCarsArrayByNewCar(car, res);
            }
        }
        return res;
    }

    private Car[] extendCarsArrayByNewCar(Car carToAdd,Car[] cars){
        if (cars.length==0){
            return new Car[] {carToAdd};
        }
        else{
            Car[] newCarsArr = new Car[cars.length+1];
        for(int i = 0; i < cars.length; i++){
            newCarsArr[i]=cars[i];

        }
            newCarsArr[cars.length]=carToAdd;
            return newCarsArr;
        }
    }

    @Override
    public String toString() {
        String result = "";
        for(Car car:cars){
            result += (car.toString()+ "\n" );
        }
        return result;
    }
}


