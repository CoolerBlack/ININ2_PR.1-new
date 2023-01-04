class Animal {
    private final String species;
    private boolean canFly;
    private Double weight;
    private boolean isAlive;

    public Animal(String species, boolean canFly) {
        this.species = species;
        this.canFly = canFly;
        this.setWeightBySpecies();
        this.isAlive = true;
    }

    public String getSpecies() {
        return this.species;
    }

    public boolean canFly() {
        return this.canFly;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void feed() {
        if (this.isAlive) {
            this.weight += 1;
        } else {
            System.out.println("Nie można karmić nieżyjącego zwierzęcia.");
        }
    }

    public void takeForAWalk() {
        if (this.isAlive) {
            this.weight -= 1;
            if (this.weight <= 0) {
                this.isAlive = false;
            }
        } else {
            System.out.println("Nie można wyprowadzać na spacer nieżyjącego zwierzęcia.");
        }
    }

    private void setWeightBySpecies() {
        if (this.species.equals("Cat")) {
            this.weight = 5.0;
        } else if (this.species.equals("Dog")) {
            this.weight = 10.0;
        } else {
            this.weight = 0.0;
        }
    }
    public String toString(){
        return species+" "+weight+" "+isAlive;
    }
}