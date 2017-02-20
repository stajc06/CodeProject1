/**
 * Created by andrew on 2/10/17.
 */

package headfirst.strategy;

public class CarrDuck extends Duck {

    public CarrDuck() {

        quackBehavior = new CarrQuack();
        flyBehavior = new FlyWithWings(); // you can choose any of the fly behaviors

    }

    public void display() {
        System.out.println("I'm a real Carr duck");
    }
}

