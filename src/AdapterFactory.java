public class AdapterFactory {
    String ChampionType;
    ChampionFactory factoryofChampionFactory = new ChampionFactory(ChampionType);
    Sylas Sylas;

    public AdapterFactory(Champion champion, String ChampionType){
        Sylas Sylas = (Sylas) champion; // 다운캐스팅
        this.Sylas = Sylas;
        this.ChampionType = ChampionType;
    }

    public Adapter createAdapter (String type) {
        Adapter tmp = null;
        switch (type) {

            case "Kayle":
                KayleAdapter KayleAdapter = new KayleAdapter(Sylas,factoryofChampionFactory.createChampion("Kayle"));
                tmp = KayleAdapter;
                break;


            case "Talon":
                TalonAdapter TalonAdapter = new TalonAdapter(Sylas,factoryofChampionFactory.createChampion("Talon"));
                tmp = TalonAdapter;
                break;

        }
        return tmp;
    }
}

