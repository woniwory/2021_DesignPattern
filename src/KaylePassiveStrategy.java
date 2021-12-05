public class KaylePassiveStrategy implements PassiveStrategy{

    int damage = 0;

    @Override
    public int action(Champion kayle) {
        return damage;
    }
}
