public class ChampionFactory {
    String OpponentChampion;

    public ChampionFactory(String OpponentChampion) {
        this.OpponentChampion = OpponentChampion;
    }

    public Champion createChampion(String type) {
        Champion tmp = null;


        switch (type) {

            case "Kayle":

                FactoryofChampionFactory KayleFactory = new KayleFactory();
                Champion Kayle = KayleFactory.createChampion();
                tmp = Kayle;
                break;



            case "Sylas":

                FactoryofChampionFactory SylasFactory = new SylasFactory(OpponentChampion);
                Champion Sylas = SylasFactory.createChampion();
                tmp = Sylas;
                break;



            case "Talon":

                FactoryofChampionFactory TalonFactory = new TalonFactory();
                Champion Talon = TalonFactory.createChampion();
                tmp = Talon;
                break;

        }

        return tmp;
    }
}
