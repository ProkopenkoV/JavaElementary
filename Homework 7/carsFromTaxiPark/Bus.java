package HW7.carsFromTaxiPark;

public class Bus implements Car {
    private int numberOfFloors;
    private int price;
    private int fuelConsumption;
    private int maxSpeed;

    public Bus(int numberOfFloors, int price, int fuelConsumption, int maxSpeed) {
        this.numberOfFloors = numberOfFloors;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Bus has the following characteristics: " +
                "Number of floors=" + numberOfFloors+"; Price = "+getCalculateCost() +"; Fuel consumption= "+getFuelConsumption()+"; Max speed= "+getMaxSpeed();
    }

    @Override
    public int getCalculateCost() {
        return 0;
    }

    @Override
    public int getFuelConsumption() {
        return 0;
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }
}

