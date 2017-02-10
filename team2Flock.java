package headfirst.strategy;
public class team2Flock {
    DurskiDuck durski = new DurskiDuck();
    FatuovaDuck fatuova = new FatuovaDuck();
        public void team2Flock() {
            durski.display();
            durski.performQuack();
            fatuova.display();
            fatuova.performQuack();
        }
    }
