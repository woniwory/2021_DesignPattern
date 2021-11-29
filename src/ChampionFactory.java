public class ChampionFactory {

    public Champion createChampion (String type)  {

        switch (type) {

            case "Kayle":
                return new Kayle();

            case "Sylas":
                return new Sylas();

            case "Talon":
                return new Talon();

        }

        return null;
    }
}

