/**
 * Created by Devon on 2/10/17.
 */
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
