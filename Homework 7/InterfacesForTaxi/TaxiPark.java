package HW7.InterfacesForTaxi;

import HW7.carsFromTaxiPark.Car;
public class TaxiPark implements ITaxiPark {



    @Override
    public int calculateCost(Car[] cars) {
        int cost = 0;
        for (Car car : cars) {
            cost += car.getCalculateCost();
        }
        return cost;
    }


    @Override
    public Car[] carSortByFuelConsumption(Car[] cars) {
        for (int i = 0; i < cars.length; i++)
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[j].getFuelConsumption() < cars[i].getFuelConsumption()) {
                    Car temp = cars[j];
                    cars[j] = cars[i];
                    cars[i] = temp;
                }
            }
            return cars;
    }

    @Override
    public Car[] findCarsBySpeedRange(Car[] vehicles, int minSpeed, int maxSpeed) {
        Car[] res = {};
        for (Car car : vehicles) {
            if (car.getMaxSpeed() >= minSpeed && car.getMaxSpeed() <= maxSpeed) {
                res = extendCarsArrayByNewCar(car, res);
            }
        }
        return res;
    }

    @Override
    public Car[] extendCarsArrayByNewCar(Car carToAdd, Car[] cars) {
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


}
