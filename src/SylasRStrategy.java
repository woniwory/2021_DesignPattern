public class SylasRStrategy implements SkillStrategy{
    Adapter Adapter;
    Sylas sylas;
    String ChampionType;

    int damage;
    int status = 0;
    public SylasRStrategy(Sylas sylas, String ChampionType){
        this.sylas = sylas;
        this.ChampionType = ChampionType;

    }
    @Override
    public int action() {

        if (sylas.Mana < 55){
            System.out.println("System : 마나가 부족합니다");
            return 0;
        }else {
            if (status == 0) {
                System.out.println("System : Sylas R - 강탈");


                    AdapterFactory AdapterFactory = new AdapterFactory();
                    Adapter Adapter = AdapterFactory.createAdapter(ChampionType);
                    this.Adapter = Adapter;
                    System.out.println("System : 케일의 궁극기를 강탈하였습니다");
                    sylas.Mana -= 75; // 처음 시전시에만 마나가 소비됨
                    sylas.SylasPassiveStack++;
                    status++;
                    return 0;

            }else if (status == 1) {
                if (ChampionType == "Kayle") {
                    KayleAdapter KayleAdapter = (KayleAdapter)Adapter;
                    damage += KayleAdapter.action();
                    status = 0;
                    sylas.SylasPassiveStack++;
                    return damage;
                }




                }





                return 0;






        }

    }
}


