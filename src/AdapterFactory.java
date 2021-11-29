public class AdapterFactory {
    public Adapter createAdapter (String type) {
        switch (type) {

            case "Kayle":
                Kayle DummyKayle = new Kayle();
                KayleAdapter KayleAdapter = new KayleAdapter(DummyKayle);
                return KayleAdapter;

            case "Talon":
                Talon DummyTalon = new Talon();
                TalonAdapter TalonAdapter = new TalonAdapter(DummyTalon);
                return TalonAdapter;

        }
        return null;
    }
}

