/**
 * Created by johngleason on 2/17/17.
 */
package headfirst.strategy;
public class GleasonDuck extends Duck{
    public GleasonDuck() {
        quackBehavior = new GleasonQuack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am Gleason duck, hear me roar!");
    }
}
