package devices;

import main.Human;

public class Phone extends Device {



    public Phone(String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);

    }
    public String getProducer(){
        return this.producer;
    }

    public String getModel(){
        return this.model;
    }

    public double getYearOfProduction(){
        return this.yearOfProduction;
    }


    public void turnOn() {
        System.out.println("turning on phone...");
    }



    public void sell(Human Seller, Human Buyer, Double price) {

    }
}