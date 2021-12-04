public abstract class Champion {


    PassiveStrategy PassiveStrategy;
    QStrategy QStrategy;
    WStrategy WStrategy;
    EStrategy EStrategy;
    RStrategy RStrategy;

    public Champion(PassiveStrategy PassiveStrategy, QStrategy QStrategy, WStrategy WStrategy, EStrategy EStrategy, RStrategy RStrategy)
    {
        this.PassiveStrategy = PassiveStrategy;
        this.QStrategy = QStrategy;
        this.WStrategy = WStrategy;
        this.EStrategy = EStrategy;
        this.RStrategy = RStrategy;

    }

    public abstract int Passive();

    public abstract int Q();

    public abstract int W();

    public abstract int E();

    public abstract int R();


    int Max_HP;
    int Max_Mana;
    String name;
    int Lv;
    int HP;
    int Mana;
    int AD;
    int AP;
    public abstract String getName();
    public abstract int getLv();
    public abstract int getHP();
    public abstract int getMana();
    public abstract int getAD();
    public abstract int getAP();
    public abstract int getMax_HP();
    public abstract int getMax_Mana();


}
