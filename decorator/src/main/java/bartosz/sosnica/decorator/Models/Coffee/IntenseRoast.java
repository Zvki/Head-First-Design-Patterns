package bartosz.sosnica.decorator.Models.Coffee;

public class IntenseRoast extends Drink {

    public IntenseRoast() {
        description = "Intense Roast";
    }

    public double cost() {
        return 5.21;
    }

}
