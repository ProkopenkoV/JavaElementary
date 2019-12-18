package HW7.InterfacesForTaxi;
import HW7.carsFromTaxiPark.Car;

public interface ITaxiPark {
    int calculateCost(Car[] cars);
    Car[] carSortByFuelConsumption(Car[] cars);
    Car[] findCarsBySpeedRange(Car[] vehicles, int minSpeed,int maxSpeed);
    Car[] extendCarsArrayByNewCar(Car carToAdd,Car[] cars);

}
