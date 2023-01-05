package main;

import creatures.Animal;
import devices.Car;
import devices.Phone;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal cat = new Animal("Cat", false) {
            @Override
            public void feed(Integer foodWeight) {

            }
        };
        System.out.println(cat.getWeight());


        cat.feed();
        System.out.println(cat.getWeight());

        cat.takeForAWalk();
        System.out.println(cat.getWeight());

        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        System.out.println(cat.getWeight());

        cat.feed();
        System.out.println(cat.getWeight());

        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        System.out.println(cat.getWeight());

        Car car = new Car("Toyota", "Corolla", 2020, 7.5, 2000);
        Human john = new Human("John", 10,cat,1000.0,0.1);
        john.setCar(car);
        System.out.println(john.getCar().getProducer());

        Human janek = new Human("Janek", 20, cat,2000.0, 98.0);
        System.out.println("Wypka Janka: " + janek.getSalary());

        Human jane = new Human("Jane", 25,cat,  3000.0, 3242.1 );
        System.out.println(jane.getSalary());


        Human jeremiasz = new Human("Jeremiasz", 27, cat,2100.0, 300.1);
        jeremiasz.setSalary(1000.0);
        jeremiasz.setSalary(-3000.0);
        jeremiasz.getSalary();

        jeremiasz.setCar(car);


        Car car2 = new Car("Toyota", "Yaris", 2000, 6.0, 0.5);
        Car car3 = new Car("Toyota", "Yaris", 2000, 6.0, 0.5);
        if (car2.equals(car3)) {
            System.out.println("Samochody są sobie równe.");
        } else {
            System.out.println("Samochody są sobie nierówne.");
        }

        Animal a1= new Animal("Dog", false) {
            @Override
            public void feed(Integer foodWeight) {

            }
        };
        System.out.println(a1);

        Human h1=new Human("Olaf", 12, a1, 2500.0, 1000.0);
        System.out.println(h1);



        Car c1=new Car("Toyota", "Yaris", 2000, 6.0, 0.5);
        System.out.println(c1);

        Phone p1=new Phone("szajsung", "h11", 2022);
        System.out.println(p1);

        p1.turnOn();
        c1.turnOn();

        cat.sell(h1, jeremiasz, 200.0);
        h1.setPet(cat);
        cat.sell(h1, jeremiasz, 200.0);
        h1.sell(john, jeremiasz, 1.0);

        h1.setCar(c1);
        c1.sell(h1, jeremiasz, 1.1);
    }

}