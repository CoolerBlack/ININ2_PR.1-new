package devices;

import main.Human;

public abstract class Device implements Selleable{
    public String producer;

    public double yearOfProduction;
    public String model;

    public Device(String producer, String model, double yearOfProduction){
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;

    }

    public Device() {

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
    public String toString(){
        return model+" "+yearOfProduction;
    }

    public abstract void turnOn();


    public void sellable(Human seller, Human buyer, Double price) {
        if (seller.car != this) {
            System.out.println("Nie możesz sprzedawać nie swoich rzeczy!");
        } else if (buyer.cash < price) {
            System.out.println("Nie masz pieniaszka");
            buyer.cash -= price;
            seller.cash += price;
            buyer.car = (Car) this;
            seller.car = null;
            System.out.println("Udaned");
        }
    }


    public abstract int getPrice();

    public double getvalue() {
        return 0;
    }
}
