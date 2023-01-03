class Human {
    private String name;
    private int age;
    private Animal pet;
    private Car car;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.pet = pet;
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

    public void setCar(Car car) {
        this.car = car;
    }
}