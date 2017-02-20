package headfirst.strategy;

public class Falling implements FlyBehavior {

    public void fly() {
        System.out.println("This isn't flying, this is falling with style");
    }
}
