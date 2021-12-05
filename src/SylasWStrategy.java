public class SylasWStrategy implements WStrategy{

    int damage = 0;


    @Override
    public int action(Champion sylas) {

            damage = (int) (210 + sylas.getAP() * 0.9);
            System.out.println("System : Sylas W - 국왕시해자 : " + damage);
            System.out.println();

            return damage;
        }

    }



