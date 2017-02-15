package headfirst.strategy;

/**
 * Created by justinmadilia on 2/10/17.
 */
public class MadiliaDuck extends Duck {

    public MadiliaDuck() {

        quackBehavior = new MadiliaQuack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Madilia duck.");
    }

}
