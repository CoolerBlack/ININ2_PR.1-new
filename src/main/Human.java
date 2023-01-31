package main;

import creatures.Animal;
import devices.Car;
import devices.Selleable;

public class Human implements Selleable {
    private static final Object DEFAULT_HUMAN_SPECIE = "homo sapiens";
    private static final int DEFAULT_GARAGE_SIZE = 3;
    private String name;
    private int age;
    private Animal pet;

    public Car[] garage;
    private Double salary;
    private Double cash;


    public Human(String name, int age, Animal pet, Double salary, Double cash) {
        this.name = name;
        this.age = age;
        this.pet = pet;
        this.salary = salary;
        this.cash = cash;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Animal getPet() {
        return this.pet;
    }

    Car[] getCar() {
        return this.garage;
    }

    public Double getCash() {
        return this.cash;
    }

    public Human() {
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(Integer garageSize) {
        super();
        this.garage = new Car[garageSize];
    }

    public void setCar(Car newCar, Integer parkingPlace) {
        //sprawdzenie wolnego miejsca


        this.garage[parkingPlace] = newCar;
    }

    public Car getCar(Integer parkingPlace) {

        return this.garage[parkingPlace];
    }

    public void setCar(Car car) {
        if (this.salary >= car.getValue()) {
            System.out.println("Udało się kupić samochód za Monety.");
            this.garage[DEFAULT_GARAGE_SIZE] = car;
        } else if (this.salary >= car.getValue() / 12) {
            System.out.println("Masz na raty, tylko nie rozwal.");
            this.garage[DEFAULT_GARAGE_SIZE] = car;
        } else {
            System.out.println("Jestes za biedny, na Obajtka to mi nie wyglądasz.");
        }
    }


    public Double getSalary() {
        System.out.println("Wypłata wynosi: " + this.salary);
        return this.salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Nie mozna dać ujemnej kwoty byczq");
            return;
        }
        System.out.println("Dane zostały wysłane");
        System.out.println("Pani Halińcia czeka z aneksem");
        System.out.println("Każdy wie ile zarabiasz nikogo nie oszukasz -1 byq");
        this.salary = salary;
    }

    public String toString() {
        return name + " " + age + " " + salary;
    }


    public void sell(Human Seller, Human Buyer, Double price) throws Exception {

    }


    public void setCash(double cash) {
        this.cash = cash;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }


    public void setGarage(Car[] garage) {
        this.garage = garage;
    }

    public boolean hasACar(Car car) {
        for (Car value : garage) {
            if (value == car) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeSpace() {
        for (Car car : garage) {
            if (car == null) {
                return true;
            }
        }
        return false;
    }

    public void addCar(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                garage[i] == car;
                return;
            }
        }
    }
    buyer.addCar(this);
    seller.removeCar(this);
    buyer.cash -=price;
    seller.cash +=price;
    System.out.println("sukces");
}