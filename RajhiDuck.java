/**
 * Created by soma on 2/10/17.
 */
package headfirst.strategy;

public class RajhiDuck  extends Duck{
    public RajhiDuck() {

        quackBehavior = new RajhiQuack();
        flyBehavior = new FlyWithWings(); // you can choose any of the fly behaviors

    }

    public void display() {
        System.out.println("I'm a real Rajhi duck");
    }
}
