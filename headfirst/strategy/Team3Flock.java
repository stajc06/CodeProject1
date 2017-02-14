package headfirst.strategy;

/**
 * Created by mariosobrino on 2/10/17.
 */
public class Team3Flock {


    HaugDuck haug = new HaugDuck();
    HarbisonDuck harbison = new HarbisonDuck();
    MadiliaDuck madilia = new MadiliaDuck();
    SobrinoDuck sobrino = new SobrinoDuck();


    public void team3Flock(){
        haug.display();
        haug.performQuack();

        harbison.display();
        harbison.performQuack();

        madilia.display();;
        madilia.performQuack();

        sobrino.display();
        sobrino.performQuack();




    }

}
