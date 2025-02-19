package bartosz.sosnica.strategy.Implementations.Quacking;

import bartosz.sosnica.strategy.Interfaces.QuackingInterface;

public class CantQuack implements QuackingInterface {
    
    public void Quack() {
        System.out.println("...Silence...");
    }
    
}
