public class FactoryofChampionFactory {
    String OpponentChampion;

    public FactoryofChampionFactory(String OpponentChampion) {
        this.OpponentChampion = OpponentChampion;
    }

    public Champion createChampion(String type) {
        ChampionFactory factoryofChampionFactory = null;

        switch (type) {

            case "Kayle":
                factoryofChampionFactory = new KayleFactory();
                KayleFactory KayleFactory = (KayleFactory) factoryofChampionFactory; // 다운캐스팅
                KaylePassiveStrategy KaylePassive = KayleFactory.createPassive();
                KayleQStrategy KayleQ = KayleFactory.createQ();
                KayleWStrategy KayleW = KayleFactory.createW();
                KayleEStrategy KayleE = KayleFactory.createE();
                KayleRStrategy KayleR = KayleFactory.createR();

                return new Kayle(KaylePassive, KayleQ, KayleW, KayleE, KayleR);


            case "Sylas":

                factoryofChampionFactory = new SylasFactory(OpponentChampion);
                SylasFactory SylasFactory = (SylasFactory) factoryofChampionFactory; // 다운캐스팅
                SylasPassiveStrategy SylasPassive = SylasFactory.createPassive();
                SylasQStrategy SylasQ = SylasFactory.createQ();
                SylasWStrategy SylasW = SylasFactory.createW();
                SylasEStrategy SylasE = SylasFactory.createE();
                SylasRStrategy SylasR = SylasFactory.createR();

                return new Sylas(SylasPassive, SylasQ, SylasW, SylasE, SylasR);


            case "Talon":
                factoryofChampionFactory = new TalonFactory();
                TalonFactory TalonFactory = (TalonFactory) factoryofChampionFactory; // 다운캐스팅
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
