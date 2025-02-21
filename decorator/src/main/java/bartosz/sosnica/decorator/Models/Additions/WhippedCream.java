package bartosz.sosnica.decorator.Models.Additions;

import bartosz.sosnica.decorator.Models.Coffee.Drink;

public class WhippedCream extends IngredientDecorator {

    public WhippedCream(Drink drink) {
        this.drink = drink;
    }

    public String getDescription() {
        return drink.getDescription() + ", Whipped Cream";
    }

    public double cost() {

        switch (drink.getSize()) {
            case SMALL:
                return drink.cost() + 0.69;
            case MEDIUM:
                return drink.cost() + 0.79;
            case LARGE:
                return drink.cost() + 0.89;
        }

        return drink.cost();
    }

}
