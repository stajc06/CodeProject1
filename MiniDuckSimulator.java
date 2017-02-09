package headfirst.strategy;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck	mallard = new MallardDuck();
		RubberDuck	rubberDuckie = new RubberDuck();
		DecoyDuck	decoy = new DecoyDuck();
 
		ModelDuck	model = new ModelDuck();
        SchaperDuck  schaper = new SchaperDuck();

		mallard.display();
		rubberDuckie.display();
		decoy.display();
		model.display();
		schaper.display();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
		schaper.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
