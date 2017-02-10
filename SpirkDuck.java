package headfirst.strategy;

public class SpirkDuck extends Duck {

    public SpirkDuck() {
        flyBehavior = new Falling();
        quackBehavior = new SpirkQuack();
    }

    public void display() {
        System.out.println("It's pronounced 'Spurk' :)");
    }
}
