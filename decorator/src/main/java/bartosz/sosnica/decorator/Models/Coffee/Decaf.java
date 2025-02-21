package bartosz.sosnica.decorator.Models.Coffee;

public class Decaf extends Drink {

    public Decaf() {
        description = "Decaf";
    }

    public double cost() {
        return 5.35;
    }

}
