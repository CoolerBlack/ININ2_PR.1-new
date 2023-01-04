package devices;

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

    @Override
    public void turnOn() {
        System.out.println("turning on phone...");
    }


}