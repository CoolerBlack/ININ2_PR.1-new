public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal cat = new Animal("Cat", false);
        System.out.println(cat.getWeight());

        Animal dog = new Animal("Dog", false);
        System.out.println(dog.getWeight());

        Animal unknown = new Animal("Unknown", false);
        System.out.println(unknown.getWeight());


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


    }

}