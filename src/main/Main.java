package main;

import creatures.Animal;
import devices.LPGCar;

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

        Human a = new Human("a",30, cat, 10000.0, 300000.0);
        Human b = new Human("b",30, cat, 10000.0, 300000.0);
        Human c = new Human("c",30, cat, 10000.0, 300000.0);
        Human d = new Human("d",30, cat, 10000.0, 300000.0);
        LPGCar x = new LPGCar("toyota", "yaris", 2000, 5.5, 20) {
            @Override
            public void sell(Human Seller, Human Buyer, Double price) throws Exception {

            }

            @Override
            public int getPrice() {
                return 0;
            }
        };
        a.setCar(x, 0);

        a.carsValue();
        System.out.println(a);

        a.setCar(x, 1);
        System.out.println(a);
}
}