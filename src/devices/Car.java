package devices;

//import main.Human;
import devices.LPGCar;
import main.*;


public abstract class Car extends Device {

    public double fuelConsumption;
    public double value;


    public Car(String producer, String model, int yearOfProduction, double fuelConsumption, double value) {
        super(producer, model, yearOfProduction);
    }

    public Car() {
        super();
    }

    public String getProducer() {
        return this.producer;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public void turnOn() {
        System.out.println("turning on car...");

    }

    public int getYear() {
        return (int) this.yearOfProduction;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Car car)) {
            return false;
        }
        return this.producer.equals(car.producer) && this.model.equals(car.model);
    }

    public abstract void refuel();


    public void sell(Human seller, Human buyer, double price) throws Exception {
        if (!seller.hasACar(this)) {
            throw new Exception("nie ma auta");
        }
        if (!buyer.hasFreeSpace()) {
            throw new Exception("nie ma miejsca w garazu");
        }
        if (buyer.cash < price) {
            throw new Exception("nie ma cashu");
        }
        buyer.addCar(this);
        seller.removeCar(this);
        buyer.cash -= price;
        seller.cash += price;
    }

    public int getyear() {
        return (int) yearOfProduction;
    }
}