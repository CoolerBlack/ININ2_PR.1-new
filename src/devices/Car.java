package devices;

public class Car {
    private String make;
    private String model;
    private int year;
    private double fuelConsumption;

    private double value;

    public Car(String make, String model, int year, double fuelConsumption, double value) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelConsumption = fuelConsumption;
        this.value = value;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }
    public double getValue(){
        return this.value;
    }
    @Override
    public boolean equals(Object o){
        if (o == this){
            return true;
        }
        if (!(o instanceof Car)){
            return false;
        }
        Car car = (Car) o;
        return this.make.equals(car.make) && this.model.equals(car.model);
    }
    public String toString(){
        return model+" "+year;
    }
}