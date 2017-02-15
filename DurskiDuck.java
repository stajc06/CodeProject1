package headfirst.strategy;
public class DurskiDuck extends Duck {
    public DurskiDuck() {

        quackBehavior = new DurskiQuack();
        flyBehavior = new FlyWithWings(); // you can choose any of the fly behaviors

    }

    public void display() {
        System.out.println("I'm a real Durski duck");
    }
}
