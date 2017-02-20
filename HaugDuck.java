package headfirst.strategy;

public class HaugDuck extends Duck {

    public HaugDuck() {

        quackBehavior = new HaugQuack();
        flyBehavior = new FlyRocketPowered();
    }

    public void display() {
        System.out.println("I'm a real HAUUUUG duck");
    }
}
