/**
 * Created by daniel on 2/10/17.
 */
package headfirst.strategy;
public class StockerQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Quacks like a Stocker");
    }
}
