class Human {
    private String name;
    private int age;
    private Animal pet;

    public Human(String name, int age, Animal pet) {
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
}