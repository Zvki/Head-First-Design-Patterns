package bartosz.sosnica.decorator.Models.Coffee;

public class CafeSpecial extends Drink {

    public CafeSpecial() {
        description = "Cafe Special";
    }

    public double cost() {
        return 4.99;
    }

}
