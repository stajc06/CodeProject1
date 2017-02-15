package headfirst.strategy;

public class HowardDuck extends Duck {

    public HowardDuck() {
        quackBehavior = new HowardQuack();
        flyBehavior = new FlyNoWay();
    }
    public void display() {
        System.out.println("I am a legitimate Howard duck ");
    }
}
