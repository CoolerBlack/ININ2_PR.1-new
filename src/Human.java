class Human {
    private String name;
    private int age;
    private Animal pet;
    private Car car;
    private Double salary;

    public Human(String name, int age, Double salary) {
        this.name = name;
        this.age = age;
        this.pet = pet;
        this.salary = salary;
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
}