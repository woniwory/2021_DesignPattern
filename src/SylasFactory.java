public class SylasFactory extends FactoryofChampionFactory{
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

    public Sylas createChampion(){
        return new Sylas(this.createPassive(),this.createQ(), this.createW(),this.createE(),this.createR());
    }
}

