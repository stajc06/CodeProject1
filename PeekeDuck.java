/**
 * Created by Peeke on 2/10/17.
 */
package headfirst.strategy;

public class PeekeDuck extends Duck {

    public PeekeDuck() {

        quackBehavior = new PeekeQuack();
        flyBehavior = new FlyRocketPowered();

    }

    public void display() {
        System.out.println("I'm a real Peeke duck");
    }
}
