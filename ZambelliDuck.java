/**
 * @author zambeezy
 */

package headfirst.strategy;

public class ZambelliDuck extends Duck
{
    public ZambelliDuck()
    {
        quackBehavior = new ZambelliQuack();
        flyBehavior = new FlyRocketPowered();
    }

    public void display()
    {
        System.out.println("I'm a real Zambelli Duck");
    }
}
