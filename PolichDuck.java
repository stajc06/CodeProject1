package headfirst.strategy;

public class PolichDuck extends Duck {
    public PolichDuck() {

        quackBehavior = new PolichQuack();
        flyBehavior = new FlyWithWings(); // you can choose any of the fly behaviors

    }

    public void display() {
        System.out.println("I'm a real Polich duck");
    }
}

