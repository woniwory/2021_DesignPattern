public class SylasRStrategy implements SkillStrategy{
    Sylas sylas;
    Kayle DummyKayle;
    KayleRStrategy KayleR;
    int damage;
    int status = 0;
    public SylasRStrategy(Sylas sylas, Kayle DummyKayle){
        this.sylas = sylas;
        this.DummyKayle = DummyKayle;
    }
    @Override
    public int action() {

        if (sylas.Mana < 55){
            System.out.println("System : 마나가 부족합니다");
            return 0;
        }else {
            if (status == 0) {
                System.out.println("System : Sylas R - 강탈");
                KayleRStrategy KayleR = new KayleRStrategy(DummyKayle);
                this.KayleR = KayleR;
                System.out.println();
                sylas.Mana -= 75; // 처음 시전시에만 마나가 소비됨
//            KayleAdapter KayleAdapter = new KayleAdapter();
                sylas.SylasPassiveStack++;
                status++;
                return 0;
            } else if (status == 1) {
                DummyKayle.Mana = DummyKayle.Max_Mana;
                KayleR.action();
                status = 0;
                sylas.SylasPassiveStack++;
                return damage;

            }
            return 0;

        }

    }
}


