package bartosz.sosnica.decorator.Models.Coffee;

public class Espresso extends Drink {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 6.49;
    }

}
