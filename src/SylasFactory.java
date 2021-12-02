public class SylasFactory implements ChampionStrategyFactory{
    String OpponentChampion;

    public SylasFactory(String OpponentChampion){
        this.OpponentChampion = OpponentChampion;
    }

    public SylasPassiveStrategy createPassive() {
        return new SylasPassiveStrategy();
    }

    public SylasQStrategy createQ() {
        return new SylasQStrategy();
    }

    public SylasWStrategy createW() {
        return new SylasWStrategy();
    }

    public SylasEStrategy createE() {
        return new SylasEStrategy();
    }

    public SylasRStrategy createR() {
        return new SylasRStrategy(OpponentChampion);
    }

//return new Kayle(KaylePassive,KayleQ,KayleW,KayleE,KayleR);
}

