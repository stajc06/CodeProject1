
package headfirst.strategy;

public class MeonoDuck extends Duck {

    public MeonoDuck() {

        quackBehavior = new MeonoQuack();
        flyBehavior = new FlyWithWings(); // you can choose any of the fly behaviors

    }

    public void display() {
        System.out.println("I'm a real Meono duck");
    }
}
