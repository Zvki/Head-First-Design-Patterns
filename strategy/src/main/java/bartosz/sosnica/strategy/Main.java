package bartosz.sosnica.strategy;

import bartosz.sosnica.strategy.Models.MallardDuck;
import bartosz.sosnica.strategy.Models.ModelDuck;
import bartosz.sosnica.strategy.Implementations.Flying.FlyingWithJetEngine;
import bartosz.sosnica.strategy.Models.Duck;
import bartosz.sosnica.strategy.Models.Lure;

public class Main {
    public static void main(String[] args) {

        Duck wildDuck = new MallardDuck();
        wildDuck.display();
        wildDuck.DoQuack();
        wildDuck.DoFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.DoFly();
        modelDuck.setFlyingInterface(new FlyingWithJetEngine());
        modelDuck.DoFly();

        Duck lureDuck = new Lure();
        lureDuck.display();
        lureDuck.DoQuack();
        lureDuck.DoFly();
        
    }
}