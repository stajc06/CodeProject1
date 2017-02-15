package headfirst.strategy;

public class HarbisonDuck extends Duck {

    public HarbisonDuck() {

        quackBehavior = new HarbisonQuack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Harbison duck");
    }
}
