public class ChampionFactory {

    public Champion createChampion (String type)  {
        Champion returnType = null;
        switch (type) {

            case "Kayle":
                return new Kayle();

            case "Sylas":
                return new Sylas();
        }

        return null;
    }
}

