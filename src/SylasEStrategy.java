public class SylasEStrategy implements EStrategy {

    int damage;
    int status = 0;

    @Override
    public int action(Champion sylas) {


        if (status == 0) {
            System.out.println("System : Sylas E - 도주 ");
            System.out.println();
            status++;
            return 0;

        } else if (status == 1) {

            damage = (int) (280 + sylas.getAP() * 1.0);
            System.out.println("System : Sylas E - 억압 : " + damage);
            System.out.println();
            status = 0;
            return damage;

        }
        return 0;
    }
    }




