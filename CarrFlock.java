/**
 * Created by andrew on 2/10/17.
 */
package headfirst.strategy;

public class CarrFlock {
    CarrDuck  carr = new CarrDuck();

    public void CarrFlock()
    {
        carr.display();
        carr.performQuack();
    }

}