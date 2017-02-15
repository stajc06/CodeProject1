package headfirst.strategy;

/**
 * Created by mariosobrino on 2/10/17.
 */
public class SobrinoDuck extends Duck{

    public SobrinoDuck(){
        
        quackBehavior = new SobrinoQuack();
        flyBehavior = new FlyWithWings();

    }

    public void display() {
        System.out.println("I'm a real Sobrino duck");
    }

}
