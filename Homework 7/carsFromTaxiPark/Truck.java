package HW7.carsFromTaxiPark;


public class Truck implements Car{
    private int bodyVolume;
    private int price;
    private int fuelConsumption;
    private int maxSpeed;

    public Truck(int bodyVolume, int price, int fuelConsumption, int maxSpeed) {
        this.bodyVolume = bodyVolume;
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
        return "Truck has the following characteristics: " +
                "Body volume= " + bodyVolume+"; Price = "+getCalculateCost() +"; Fuel consumption= "+getFuelConsumption()+"; Max speed= "+getMaxSpeed();
    }
}
