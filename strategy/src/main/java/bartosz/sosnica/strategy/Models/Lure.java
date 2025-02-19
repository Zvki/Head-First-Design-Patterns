package bartosz.sosnica.strategy.Models;

import bartosz.sosnica.strategy.Implementations.Flying.CantFly;
import bartosz.sosnica.strategy.Implementations.Quacking.CanQuack;

public class Lure extends Duck {
    
    public Lure () {
        quackingInterface = new CanQuack();
        flyingInterface = new CantFly();
    }

    public void display() {
        System.out.println("I'm a lure");
    }
}
