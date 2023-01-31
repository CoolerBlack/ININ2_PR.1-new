package devices;

import main.Human;

import java.net.URL;
import java.util.List;

public class Phone extends Device {

    private double screenSize;
    private int batteryCapacity;
    public static final String DEFAULT_SERVER_ADDRESS = "https://www.example.com";
    public static final String DEFAULT_PROTOCOL = "https";
    public static final String DEFAULT_VERSION_NAME = "1.0";

    public Phone(String producer, String model, int yearOfProduction, Integer screenSize, Integer batteryCapacity) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
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

    @Override
    public int getPrice() {
        return 0;
    }

    public void installAnnApp(String appName){

    }
    public void installAnnApp(String appName, String appVersion){

    }
    public void installAnnApp(String appName, String appVersion, String serverAddress){

    }

    public void installAnnApp(List<String> appNames){

    }

    public void installAnnApp(URL appURL){

    }

    public void sell(Human Seller, Human Buyer, Double price) {

    }
}