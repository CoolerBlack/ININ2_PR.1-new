package devices;
import main.*;

public class CarSalles {
    private int value;
    private Human Seller;
    private Human Buyer;

    public CarSalles(int value, Human seller, Human buyer) {
        this.value = value;
        Seller = seller;
        Buyer = buyer;
    }
    public String toString(){
     return "kupujący: " + Buyer + "sprzadający: " + Seller + "Kwota: " +value;
    }
}
