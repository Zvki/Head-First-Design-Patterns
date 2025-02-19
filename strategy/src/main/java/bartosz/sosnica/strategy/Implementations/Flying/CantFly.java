package bartosz.sosnica.strategy.Implementations.Flying;

import bartosz.sosnica.strategy.Interfaces.FlyingInterface;

public class CantFly implements FlyingInterface {

    public void Fly() {
        System.out.println("I can't fly!");
    }
    
}
