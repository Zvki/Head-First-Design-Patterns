package bartosz.sosnica.decorator;

import bartosz.sosnica.decorator.Models.Coffee.Espresso;
import bartosz.sosnica.decorator.Models.Additions.SoyMilk;
import bartosz.sosnica.decorator.Models.Coffee.Drink;

public class Main {
    public static void main(String[] args) {

        Drink espresso = new Espresso();
        System.out.println(espresso.getDescription() + " costs: " + espresso.cost());
        espresso.setSize(Drink.Size.LARGE);

        Drink espressoWithSoyMilk = new SoyMilk(espresso);
        System.out.println(espressoWithSoyMilk.getDescription() + " costs: " + espressoWithSoyMilk.cost());

        espressoWithSoyMilk = new SoyMilk(espressoWithSoyMilk);
        System.out.println(espressoWithSoyMilk.getDescription() + " costs: " + espressoWithSoyMilk.cost());

    }
}