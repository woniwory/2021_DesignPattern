public class AdapterFactory {
    public Adapter createAdapter (String type) {
        switch (type) {

            case "Kayle":
                Kayle DummyKayle = new Kayle();
                KayleAdapter KayleAdapter = new KayleAdapter(DummyKayle);
                return KayleAdapter;
        }
        return null;
    }
}

