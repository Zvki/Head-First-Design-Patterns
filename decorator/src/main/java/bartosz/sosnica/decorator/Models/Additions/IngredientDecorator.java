package bartosz.sosnica.decorator.Models.Additions;

import bartosz.sosnica.decorator.Models.Coffee.Drink;

public abstract class IngredientDecorator extends Drink {

    Drink drink;

    public abstract String getDescription();

}
