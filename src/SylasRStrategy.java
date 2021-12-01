public class SylasRStrategy implements RStrategy{

    String ChampionType;

    int damage;
    int status = 0;
    public SylasRStrategy(String ChampionType){
        this.ChampionType = ChampionType;

    }
    @Override
    public int action(Champion sylas) {

            if (status == 0) {

                System.out.println("System : Sylas R - 강탈");
                ChampionFactory championFactory = new ChampionFactory(ChampionType);
                Champion champion = championFactory.createChampion(ChampionType);


                    System.out.println("System : "+ champion.getName()+"의 궁극기를 강탈하였습니다");
                    status++;
                    return 0;

            }else if (status == 1) {
                AdapterFactory AdapterFactory = new AdapterFactory(sylas, ChampionType);
                Adapter Adapter = AdapterFactory.createAdapter(ChampionType);

                    damage += Adapter.action();
                    status = 0;

                    return damage;
                }

                return 0;




    }
}


