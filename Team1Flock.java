package headfirst.strategy;

public class Team1Flock {
    HarrisDuck harris = new HarrisDuck();
    PeekeDuck peeke = new PeekeDuck();
    ZambelliDuck zambo = new ZambelliDuck();
    HowardDuck howie = new HowardDuck();

    public void Team1Flock() {
        harris.display();
        harris.performQuack();
        harris.performFly();

        peeke.display();
        peeke.performQuack();
        peeke.performFly();

        zambo.display();
        zambo.performQuack();
        zambo.performFly();

        howie.display();
        howie.performQuack();
        howie.performFly();
    }
}
