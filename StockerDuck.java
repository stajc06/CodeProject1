/**
 * Created by daniel on 2/10/17.
 */
package headfirst.strategy;
public class StockerDuck extends Duck{
    public StockerDuck(){
        quackBehavior = new StockerQuack();
        flyBehavior = new FlyRocketPowered();
    }
    public void display(){
        System.out.println("I'm a real Stocker duck");
    }
}
