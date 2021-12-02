public class TalonFactory extends FactoryofChampionFactory{
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

    public Talon createChampion(){
        return new Talon(this.createPassive(),this.createQ(), this.createW(),this.createE(),this.createR());
    }
}

