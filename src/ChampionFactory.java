public class ChampionFactory {
    String OpponentChampion;

    public ChampionFactory(String OpponentChampion) {
        this.OpponentChampion = OpponentChampion;
    }

    public Champion createChampion(String type) {
        ChampionStrategyFactory ChampionStrategyFactory = null;

        switch (type) {

            case "Kayle":
                ChampionStrategyFactory = new KayleFactory();
                KayleFactory KayleFactory = (KayleFactory) ChampionStrategyFactory; // 다운캐스팅
                KaylePassiveStrategy KaylePassive = KayleFactory.createPassive();
                KayleQStrategy KayleQ = KayleFactory.createQ();
                KayleWStrategy KayleW = KayleFactory.createW();
                KayleEStrategy KayleE = KayleFactory.createE();
                KayleRStrategy KayleR = KayleFactory.createR();

                return new Kayle(KaylePassive, KayleQ, KayleW, KayleE, KayleR);


            case "Sylas":

                ChampionStrategyFactory = new SylasFactory(OpponentChampion);
                SylasFactory SylasFactory = (SylasFactory) ChampionStrategyFactory; // 다운캐스팅
                SylasPassiveStrategy SylasPassive = SylasFactory.createPassive();
                SylasQStrategy SylasQ = SylasFactory.createQ();
                SylasWStrategy SylasW = SylasFactory.createW();
                SylasEStrategy SylasE = SylasFactory.createE();
                SylasRStrategy SylasR = SylasFactory.createR();

                return new Sylas(SylasPassive, SylasQ, SylasW, SylasE, SylasR);


            case "Talon":
                ChampionStrategyFactory = new TalonFactory();
                TalonFactory TalonFactory = (TalonFactory) ChampionStrategyFactory; // 다운캐스팅
                TalonPassiveStrategy TalonPassive = TalonFactory.createPassive();
                TalonQStrategy TalonQ = TalonFactory.createQ();
                TalonWStrategy TalonW = TalonFactory.createW();
                TalonEStrategy TalonE = TalonFactory.createE();
                TalonRStrategy TalonR = TalonFactory.createR();

                return new Talon(TalonPassive, TalonQ, TalonW, TalonE, TalonR);


        }

        return null;
    }
}
