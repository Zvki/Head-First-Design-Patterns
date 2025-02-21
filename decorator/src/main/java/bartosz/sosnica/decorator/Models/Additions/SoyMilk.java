package bartosz.sosnica.decorator.Models.Additions;

import bartosz.sosnica.decorator.Models.Coffee.Drink;

public class SoyMilk extends IngredientDecorator {

    public SoyMilk(Drink drink) {
        this.drink = drink;
    }

    public String getDescription() {
        return drink.getDescription() + ", Soy Milk";
    }

    public double cost() {
        switch (drink.getSize()) {
            case SMALL:
                return drink.cost() + 0.55;
            case MEDIUM:
                return drink.cost() + 0.65;
            case LARGE:
                return drink.cost() + 0.75;
        }

        return drink.cost();
    }

}
