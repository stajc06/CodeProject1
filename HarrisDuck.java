package headfirst.strategy;

public class HarrisDuck extends Duck
{
    public HarrisDuck
    {
        flybehavior = new FlyWithWings();
        quackbehavior = new HarrisQuack();
    }

    public void display()
    {
        System.out.println("I'm a real Harris duck.");
    }
}
