/**
 * Created by Rocco on 2/10/17.
 */
package headfirst.strategy;
public class FatuovaDuck extends Duck {
    public FatuovaDuck() {

        quackBehavior = new FatuovaQuack();
        flyBehavior = new FlyWithWings(); // you can choose any of the fly behaviors

    }

    public void display() {
        System.out.println("I'm a real Fatuova duck");
    }
}

