package HW7.carsFromTaxiPark;

public class ElectricCar implements Car{
    private int amountOfNoise;
    private int price;
    private int fuelConsumption;
    private int maxSpeed;

    public ElectricCar(int amountOfNoise, int price, int fuelConsumption, int maxSpeed) {
        this.amountOfNoise = amountOfNoise;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
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

    @Override
    public String toString() {
        return "Electric сar has the following characteristics: " +
                "Amount of noise=" + amountOfNoise+"; Price = "+getCalculateCost() +"; Fuel consumption= "+getFuelConsumption()+"; Max speed= "+getMaxSpeed();
    }

}
