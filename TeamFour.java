/**
 * Created by Nemo on 2/10/17.
 */
package headfirst.strategy;

public class TeamFour {

   SchaperDuck schaper = new SchaperDuck();
    ObrienDuck obrien = new ObrienDuck();
    SpirkDuck spirk = new SpirkDuck();
    BalgaDuck balga = new BalgaDuck();
    StockerDuck stocker = new StockerDuck();

    public void teamFourFlock()
    {
      obrien.display();
        obrien.performQuack();
        balga.display();
        balga.performQuack();
        stocker.display();
        stocker.performQuack();
        spirk.display();
        spirk.performQuack();
        spirk.performFly();
    }
}
