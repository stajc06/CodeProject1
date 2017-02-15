package headfirst.strategy;
public class MateoDuck extends Duck{

        public MateoDuck() {

            quackBehavior = new MateoQuack();
            flyBehavior = new FlyWithWings(); // you can choose any of the fly behaviors

        }

        public void display() {
            System.out.println("I'm a real Mateo duck");
        }
    }

