package bartosz.sosnica.strategy.Models;

import bartosz.sosnica.strategy.Implementations.Flying.CanFly;
import bartosz.sosnica.strategy.Implementations.Quacking.CanQuack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackingInterface = new CanQuack();
        flyingInterface = new CanFly();
    }

    public void display() {
        System.out.println("I'm a Mallard Duck!");
    }
    
}
