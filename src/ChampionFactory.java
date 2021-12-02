public interface ChampionFactory {
    public PassiveStrategy createPassive();
    public QStrategy createQ();
    public WStrategy createW();
    public EStrategy createE();
    public RStrategy createR();

}
