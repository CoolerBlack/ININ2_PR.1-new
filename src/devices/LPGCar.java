package devices;

abstract class LPG extends Car {
    public LPG(String producer, String model, int yearOfProduction, double fuelConsumption, double value) {
        super(producer, model, yearOfProduction, fuelConsumption, value);
    }
}