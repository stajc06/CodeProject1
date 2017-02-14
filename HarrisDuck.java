package headfirst.strategy;

public class HarrisDuck extends Duck
{
    public HarrisDuck()
    {
        flyBehavior = new FlyWithWings();
        quackBehavior = new HarrisQuack();
    }

    public void display()
    {
        System.out.println("I'm a real Harris duck.");
    }
}
