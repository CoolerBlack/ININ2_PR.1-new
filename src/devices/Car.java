package devices;

import main.Human;

public abstract class Car extends Device {

    public double fuelConsumption;
    public double value;
    private Object seller;
    private Object buyer;

    public Car(String producer, String model, int yearOfProduction, double fuelConsumption, double value) {
        super(producer, model, yearOfProduction);
        this.fuelConsumption = fuelConsumption;
        this.value = value;

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
        return this.value;
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


    public void sell(Human Seller, Human Buyer, Double price) throws Exception {
        if (!seller.hasACar(this)) {
            throw new Exception("nie ma auta");
        }
        if (!buyer.hasFreeSpace()) {
            throw new Exception("nie ma miejsca w garazu");
        }
        if (buyer.cash < price) {
            throw new Exception("nie ma cashu");
        }


    }

}