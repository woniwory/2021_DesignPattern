public class KaylePassiveStrategy implements PassiveStrategy{
    Champion kayle;
    int damage = 0;

    @Override
    public int action(Champion kayle) {
        return damage;
    }
}
