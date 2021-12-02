public class KayleFactory extends FactoryofChampionFactory{

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

    public Kayle createChampion(){

        return new Kayle(this.createPassive(),this.createQ(), this.createW(),this.createE(),this.createR());

    }


}

