public class TalonFactory implements ChampionStrategyFactory{
    public TalonPassiveStrategy createPassive() {
        return new TalonPassiveStrategy();
    }

    public TalonQStrategy createQ() {
        return new TalonQStrategy();
    }

    public TalonWStrategy createW() {
        return new TalonWStrategy();
    }

        public TalonEStrategy createE() {
        return new TalonEStrategy();
    }

        public TalonRStrategy createR() {
        return new TalonRStrategy();
    }

//return new Kayle(KaylePassive,KayleQ,KayleW,KayleE,KayleR);
}

