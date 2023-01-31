package devices;

import main.Human;

public abstract class DiselCar extends Car{
    public DiselCar(String producer, String model, int yearOfProduction, double fuelConsumption, double value) {
        super(producer, model, yearOfProduction, fuelConsumption, value);
    }
    public void refuel() {
        System.out.println("1.9 tdi pełny, możesz kopcić");
    }
    public void sellable(Human seller, Human buyer, double price) {
    }

}
