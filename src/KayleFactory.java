public class KayleFactory implements ChampionStrategyFactory{

    public KaylePassiveStrategy createPassive() {
        return new KaylePassiveStrategy();
    }

    public KayleQStrategy createQ() {
        return new KayleQStrategy();
    }

    public KayleWStrategy createW() {
        return new KayleWStrategy();
    }

    public KayleEStrategy createE() {
        return new KayleEStrategy();
    }

    public KayleRStrategy createR() {return new KayleRStrategy(); }


}

