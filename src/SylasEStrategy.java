public class SylasEStrategy implements SkillStrategy{
    Sylas sylas;
    int damage;
    int status = 0;
    public SylasEStrategy(Sylas sylas){
        this.sylas = sylas;
    }
    @Override
    public int action() {

        if (status == 0) {
            System.out.println("Sylas E - 도주 ");
            sylas.Mana -= 65; // 처음 시전시에만 마나가 소비됨
            status++;
            return 0;
        }
        else if (status == 1) {

            damage = (int)(280 + sylas.getAP()*1.0);
            System.out.println("Sylas E - 억압: "+damage);
            status = 0;
            return damage;

        }
        return 0;
    }
}


