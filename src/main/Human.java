package main;

import creatures.Animal;
import devices.Car;
import devices.Selleable;

public class Human implements Selleable {
    private String name;
    private int age;
    private Animal pet;
    private Car car;
    private Double salary;
    private  Double cash;

    public Human(String name, int age, Animal pet, Double salary, Double cash) {
        this.name = name;
        this.age = age;
        this.pet = pet;
        this.salary = salary;
        this.cash = cash;
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

    public Car getCar() {
        return this.car;
    }

    public Double getCash(){
        return this.cash;
    }



    public void setCar(Car car) {
        if (this.salary >= car.getValue()) {
            System.out.println("Udało się kupić samochód za Monety.");
            this.car = car;
        } else if (this.salary >= car.getValue() / 12) {
            System.out.println("Masz na raty, tylko nie rozwal.");
            this.car = car;
        } else {
            System.out.println("Jestes za biedny, na Obajtka to mi nie wyglądasz.");
        }
    }


    public Double getSalary() {
        System.out.println("Wypłata wynosi: "+ this.salary);
        return this.salary;
    }

    public void setSalary(Double salary){
        if (salary < 0) {
            System.out.println("Nie mozna dać ujemnej kwoty byczq");
            return;
        }
        System.out.println("Dane zostały wysłane");
        System.out.println("Pani Halińcia czeka z aneksem");
        System.out.println("Każdy wie ile zarabiasz nikogo nie oszukasz -1 byq");
        this.salary = salary;
    }

        public String toString(){
        return name+" "+age+" "+salary;
        }



    public void sell(Human Seller, Human Buyer, Double price) {

    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }


}