public class SylasRStrategy implements SkillStrategy{
    Sylas sylas;
    int damage;
    int status = 0;
    public SylasRStrategy(Sylas sylas){
        this.sylas = sylas;
    }
    @Override
    public int action() {

        if (status == 0) {
            System.out.println("Sylas R - 강탈");
            sylas.Mana -= 75; // 처음 시전시에만 마나가 소비됨
            KayleAdapter KayleAdapter = new KayleAdapter();
            status++;
            return 0;
        }
        else if (status == 1) {


            status = 0;
            return damage;

        }
        return 0;

    }
}


