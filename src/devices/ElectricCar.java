package devices;

import main.Human;

public abstract class ElectricCar extends Car{
    public ElectricCar(String producer, String model, int yearOfProduction, double fuelConsumption, double value) {
        super(producer, model, yearOfProduction, fuelConsumption, value);
    }
    public void refuel(){
        System.out.println("tesla pełna");
    }
    public void sellable(Human seller, Human buyer, double price) {

    }
}
