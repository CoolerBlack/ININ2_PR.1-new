public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal cat = new Animal("Cat", false);
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

        Car car = new Car("Toyota", "Corolla", 2020, 7.5);
        Human john = new Human("John", 30);
        john.setCar(car);
        System.out.println(john.getCar().getMake());

    }

}