public class AdapterFactory {
    String ChampionType;
    ChampionFactory championFactory = new ChampionFactory(ChampionType);
    Sylas Sylas;

    public AdapterFactory(Champion champion, String ChampionType){
        Sylas Sylas = (Sylas) champion; // 다운캐스팅
        this.Sylas = Sylas;
        this.ChampionType = ChampionType;
    }

    public Adapter createAdapter (String type) {


        switch (type) {

            case "Kayle":

                Champion dummyKayle = championFactory.createChampion("Kayle");
                KayleAdapter KayleAdapter = new KayleAdapter(Sylas,dummyKayle);
                return KayleAdapter;


            case "Talon":
                Champion dummyTalon = championFactory.createChampion("Talon");
                TalonAdapter TalonAdapter = new TalonAdapter(Sylas,dummyTalon);
                return TalonAdapter;

        }
        return null;
    }
}

