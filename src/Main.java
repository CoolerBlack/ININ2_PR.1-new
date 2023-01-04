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

        Car car = new Car("Toyota", "Corolla", 2020, 7.5, 2000);
        Human john = new Human("John", 10,1000.0);
        john.setCar(car);
        System.out.println(john.getCar().getMake());

        Human janek = new Human("Janek", 20, 2000.0);
        System.out.println("Wypka Janka: " + janek.getSalary());

        Human jane = new Human("Jane", 25, 3000.0);
        System.out.println(jane.getSalary());


        Human jeremiasz = new Human("Jeremiasz", 27, 2100.0);
        jeremiasz.setSalary(1000.0);
        jeremiasz.setSalary(-3000.0);
        jeremiasz.getSalary();

        jeremiasz.setCar(car);
    }

}