package headfirst.strategy;
public class team2Flock {
    DurskiDuck durski = new DurskiDuck();
    PolichDuck polich = new PolichDuck();
    FatuovaDuck fatuova = new FatuovaDuck();
    RajhiDuck Rajhi = new RajhiDuck();
    DahdohDuck Dahdoh = new DahdohDuck();
        public void team2Flock() {
            durski.display();
            durski.performQuack();
            polich.display();
            polich.performQuack();
            fatuova.display();
            fatuova.performQuack();
            Rajhi.display();
            Rajhi.performQuack();
            Dahdoh.display();
            Dahdoh.performQuack();
        }
    }
