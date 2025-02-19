package bartosz.sosnica.strategy.Implementations.Quacking;

import bartosz.sosnica.strategy.Interfaces.QuackingInterface;

public class CanQuack implements QuackingInterface {
    
    public void Quack() {
        System.out.println("Quack! Quack!");
    }
    
}
