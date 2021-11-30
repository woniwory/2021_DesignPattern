public class SylasEStrategy implements EStrategy{
    Sylas sylas;
    int damage;
    int status = 0;
    public SylasEStrategy(Sylas sylas){
        this.sylas = sylas;
    }
    @Override
    public int action() {


        if (sylas.Mana < 65){
            System.out.println("System : 마나가 부족합니다");
            return 0;
        }

        else {
            if (status == 0) {
                System.out.println("System : Sylas E - 도주 ");
                System.out.println();
                sylas.Mana -= 65; // 처음 시전시에만 마나가 소비됨
                sylas.SylasPassiveStack++;
                status++;
                return 0;
            } else if (status == 1) {

                damage = (int) (280 + sylas.getAP() * 1.0);
                System.out.println("System : Sylas E - 억압 : " + damage);
                System.out.println();
                sylas.SylasPassiveStack++;
                status = 0;
                return damage;

            }
        }
        return 0;
    }
}


