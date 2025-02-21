package bartosz.sosnica.decorator.Models.Additions;

import bartosz.sosnica.decorator.Models.Coffee.Drink;

public class Chocolate extends IngredientDecorator {

    public Chocolate(Drink drink) {
        this.drink = drink;
    }

    public String getDescription() {
        return drink.getDescription() + ", Chocolate";
    }

    public double cost() {
        switch (drink.getSize()) {
            case SMALL:
                return drink.cost() + 1.1;
            case MEDIUM:
                return drink.cost() + 1.2;
            case LARGE:
                return drink.cost() + 1.3;
        }

        return drink.cost();
    }
}
