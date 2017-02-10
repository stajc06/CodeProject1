/**
 * @author zambeezy
 */

package headfirst.strategy;

public class ZambelliDuck extends Duck
{
    quackBehavior quack = new ZambelliQuack();
    flyBehavior fly = new FlyRocketPowered();

    public void display()
    {
        System.out.println("I'm a real Zambelli Duck");
    }
}
