package devices;

public class Phone {
    private String model;
    private int year;

    public Phone(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }
    public String toString(){
        return model+" "+year;
    }
}