package creatures;
import main.Human;
import devices.Selleable;

public abstract class Animal implements Selleable, Feedable {
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

    public Animal(String species) {

        this.species = null;
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
    public void feed(Integer foodWeight){

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


    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getPet() == this) {
            if (buyer.getCash() >= price) {
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                buyer.setPet(this);
                seller.setPet(null);
                System.out.println("Kupiłeś furrasa.");
            } else {
                System.out.println("Nie masz kaski.");
            }
        } else {
            System.out.println("Nie mozesz sprzedac nie majac.");
        }
    }
    }
