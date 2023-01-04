package devices;

public abstract class Device {
    public String producer;

    public double yearOfProduction;
    public String model;

    public Device(String producer, String model, double yearOfProduction){
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
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


}
