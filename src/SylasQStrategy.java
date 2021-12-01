public class SylasQStrategy implements QStrategy{

    int damage = 0;

    @Override
    public int action(Champion sylas) {


            damage = (int) (100 + sylas.getAP() * 0.4 + 180 + sylas.getAP() * 0.9);
            System.out.println("System : Sylas Q - 사슬 후려치기 : "+damage);
            System.out.println();


            return damage;



    }
}


