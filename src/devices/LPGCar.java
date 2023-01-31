package devices;

import main.Human;

public abstract class LPGCar extends Car {
    public LPGCar(String producer, String model, int yearOfProduction, double fuelConsumption, double value) {
        super(producer, model, yearOfProduction, fuelConsumption, value);
    }
    public void refuel(){
        System.out.println("Pełna butla");
    }
    public void sellable(Human seller, Human buyer, double price) {

    }
}