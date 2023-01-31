package main;

import creatures.Animal;
import devices.*;
import devices.LPGCar;


public class Human {
    private static final Object DEFAULT_HUMAN_SPECIE = "homo sapiens";
    private static final int DEFAULT_GARAGE_SIZE = 3;
    public Device car;
    private String name;
    private int age;
    private Animal pet;

    public Car[] garage;
    private double salary;
    public double cash;
    private double price;
    private Human buyer;


    public Human(String name, int age, Animal pet, Double salary, Double cash) {
        this.name = name;
        this.age = age;
        this.pet = pet;
        this.salary = salary;
        this.cash = cash;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
        setDefaultCar();
    }

    public Human(String name, int age, Animal pet, Double salary, Double cash, int garageSize) {
        this.name = name;
        this.age = age;
        this.pet = pet;
        this.salary = salary;
        this.cash = cash;
        this.garage = new Car[garageSize];
        setDefaultCar();
    }

    private void setDefaultCar() {
        if (garage.length > 0 && garage[0] == null) {
            garage[0] = new LPGCar("Lipinki", "Łużyckie", 3, 4.0, 20) {
                @Override
                public void sell(Human Seller, Human Buyer, Double price) throws Exception {

                }

                @Override
                public int getPrice() {
                    return 0;
                }
            };
        }
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


    public Double getCash() {
        return this.cash;
    }

    public Double getPrice() {
        return this.price;
    }


    public Human() {
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(Integer garageSize) {
        super();
        this.garage = new Car[garageSize];
    }


    public Car getCar(int position) {
        if (position < garage.length && position >= 0) {
            System.out.println(garage[position]);
            return garage[position];
        } else {
            System.out.println("Pozycja sie nie zgadza.");
            return null;
        }
    }

    public void setCar(Car car, int position) {
        if (position < garage.length && position >= 0) {
            Car temp = garage[position];
            if (garage[position] != null && salary > car.getPrice()) {
                System.out.println("kupiles auto ale stare poszlo na zlom");
                this.garage[position] = car;
            } else if (garage[position] == null && salary > car.getPrice()) {
                System.out.println("Udało się kupić samochód za Monety.");
                this.garage[position] = car;
            } else if (garage[position] == null && salary > 1 / 12 * car.getPrice()) {
                System.out.println("Masz na raty, tylko nie rozwal.");
                this.garage[position] = car;
            } else {
                System.out.println("Jestes za biedny, na Obajtka to mi nie wyglądasz.");
            }
        }

    }


    public double getSalary() {
        System.out.println("Wypłata wynosi: " + this.salary);
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Nie mozna dać ujemnej kwoty byczq");
        } else {

            System.out.println("Dane zostały wysłane");
            System.out.println("Pani Halińcia czeka z aneksem");
            System.out.println("Każdy wie ile zarabiasz nikogo nie oszukasz -1 byq");
            this.salary = salary;
        }
    }

    public String toString() {
        return name + " " + age + " " + salary;
    }


    public void sellable(Human seller, Human buyer, double price) throws Exception {

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



    public void sellable(Human Seller, Human Buyer, Double price) {

    }

    public double carsValue() {
        double suma = 0.0;
        for (int i = 0; i <= garage.length; i++) {
            try {
                suma += garage[i].getvalue();
            } catch (Exception ArrayIndexOutOfBoundsException) {
                break;
            }
        }
        System.out.println("Wartość twoich pojazdów wynosi: " + suma);
        return suma;
    }

    public void sortYourGarage() {
        for (int i = 0; i < garage.length; i++) {
            for (int j = 0; j < garage.length; j++) {
                Car temp;
                if (garage[i] != null && garage[j] != null && garage[i].getyear() < garage[j].getyear()) {
                    temp = garage[i];
                    garage[i] = garage[j];
                    garage[j] = temp;
                }
            }
        }


        //Arrays.sort(garage,Comparator.comparingInt(Car::getyear));
        System.out.println("Garaż został posortowany");
    }


    public Car[] getGarage() {
        return garage;
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
                garage[i] = car;
                return;
            }
        }
    }

    public void removeCar(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == car) {
                garage[i] = null;
                return;
            }
        }
    }
}


