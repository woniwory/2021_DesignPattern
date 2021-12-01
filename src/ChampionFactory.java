public class ChampionFactory {
    String OpponentChampion;
    public ChampionFactory(String OpponentChampion){
        this.OpponentChampion = OpponentChampion;
    }

    public Champion createChampion (String type)  {

        switch (type) {

            case "Kayle":
                KaylePassiveStrategy KaylePassive = new KaylePassiveStrategy();
                KayleQStrategy KayleQ = new KayleQStrategy();
                KayleWStrategy KayleW = new KayleWStrategy();
                KayleEStrategy KayleE = new KayleEStrategy();
                KayleRStrategy KayleR = new KayleRStrategy();

                return new Kayle(KaylePassive,KayleQ,KayleW,KayleE,KayleR);

            case "Sylas":
                SylasPassiveStrategy SylasPassive= new SylasPassiveStrategy();
                SylasQStrategy SylasQ = new SylasQStrategy();
                SylasWStrategy SylasW = new SylasWStrategy();
                SylasEStrategy SylasE = new SylasEStrategy();
                SylasRStrategy SylasR = new SylasRStrategy(OpponentChampion);


                return new Sylas(SylasPassive,SylasQ,SylasW,SylasE,SylasR);

            case "Talon":
                TalonPassiveStrategy TalonPassive = new TalonPassiveStrategy();
                TalonQStrategy TalonQ = new TalonQStrategy();
                TalonWStrategy TalonW = new TalonWStrategy();
                TalonEStrategy TalonE = new TalonEStrategy();
                TalonRStrategy TalonR = new TalonRStrategy();

                return new Talon(TalonPassive,TalonQ,TalonW,TalonE,TalonR);

        }

        return null;
    }
}

