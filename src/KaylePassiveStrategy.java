public class KaylePassiveStrategy implements PassiveStrategy{
    Kayle kayle;
    int damage;
    public KaylePassiveStrategy(Kayle kayle){
        this.kayle = kayle;
    }
    @Override
    public int action() {
        return 0;
    }
}
