/**
 * Created by andrew on 2/10/17.
 */
package headfirst.strategy;

public class CarrQuack implements QuackBehavior{
    public void quack() {
        System.out.println("Quacks like a Carr");
    }
}