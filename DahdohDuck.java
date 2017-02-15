/**
 * Created by saradahdoh on 2/15/17.
 */

package headfirst.strategy;


public class DahdohDuck extends Duck {
        public DahdohDuck() {
            quackBehavior = new DahdohQuack();
            flyBehavior = new FlyWithWings();
        }

        public void display() {
            System.out.println("I'm a real Dahdoh duck");
        }
    }

