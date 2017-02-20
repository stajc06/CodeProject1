/**
 * Created by Nemo on 2/10/17.
 */
public class ObrienDuck extends Duck {
    public SchaperDuck() {

        quackBehavior = new SchaperQuack();
        flyBehavior = new FlyWithWings(); // you can choose any of the fly behaviors

    }

    public void display() {
        System.out.println("I'm a real O'Brien duck");
    }
}

