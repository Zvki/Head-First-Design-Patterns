package bartosz.sosnica.strategy.Models;

import bartosz.sosnica.strategy.Interfaces.FlyingInterface;
import bartosz.sosnica.strategy.Interfaces.QuackingInterface;

public abstract class Duck {

    QuackingInterface quackingInterface;

    FlyingInterface flyingInterface;

    Duck() {};
    
    public void DoQuack() {
        quackingInterface.Quack();
    }

    public void DoFly() {
        flyingInterface.Fly();
    }

    public void Swim() {
        System.out.println("All ducks can swim!");
    }

    public abstract void display();

    public void setQuackingInterface(QuackingInterface quackingInterface) {
        this.quackingInterface = quackingInterface;
    }

    public void setFlyingInterface(FlyingInterface flyingInterface) {
        this.flyingInterface = flyingInterface;
    }
    
}
