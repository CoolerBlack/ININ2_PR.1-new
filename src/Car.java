class Car {
    private String make;
    private String model;
    private int year;
    private double fuelConsumption;

    public Car(String make, String model, int year, double fuelConsumption) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelConsumption = fuelConsumption;
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


}