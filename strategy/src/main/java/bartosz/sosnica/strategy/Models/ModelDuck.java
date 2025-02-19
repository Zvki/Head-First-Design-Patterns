package bartosz.sosnica.strategy.Models;

import bartosz.sosnica.strategy.Implementations.Flying.CantFly;
import bartosz.sosnica.strategy.Implementations.Quacking.CanQuack;

public class ModelDuck extends Duck {
    
    public ModelDuck() {
        this.quackingInterface = new CanQuack();
        this.flyingInterface = new CantFly();
    }
    
    public void display() {
        System.out.println("I'm a model duck");
    }
    
}
