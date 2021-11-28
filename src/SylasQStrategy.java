public class SylasQStrategy implements SkillStrategy{
    Sylas sylas;
    int damage = 0;

    public SylasQStrategy(Sylas sylas){
        this.sylas = sylas;
    }
    @Override
    public int action() {
        if (sylas.Mana < 55){
            System.out.println("System : 마나가 부족합니다");
            return 0;
        }else {
            damage = (int) (100 + sylas.getAP() * 0.4 + 180 + sylas.getAP() * 0.9);
            System.out.println("System : Sylas Q - 사슬 후려치기 : "+damage);
            System.out.println();
            sylas.SylasPassiveStack++;
            sylas.Mana -= 55;
            return damage;

        }



    }
}


