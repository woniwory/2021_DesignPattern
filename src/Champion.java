public abstract class Champion {

    PassiveStrategy PassiveStrategy;
    QStrategy QStrategy;
    WStrategy WStrategy;
    EStrategy EStrategy;
    RStrategy RStrategy;




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
