
package headfirst.strategy;


public class BalgaDuck extends Duck {
    public BalgaDuck() {
        flybehavior = new FlyRocketPowered();
        quackBehavior = new BalgaQuack();
    }
    public void display() {
        System.out.println("I'm a real Balga duck");
    }
}
}
