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

    public int Passive(){
        int damage = PassiveStrategy.action(this);
        return damage;
    }

    public int Q(){
        int damage = QStrategy.action(this);
        return damage;
    }

    public int W(){
        int damage = WStrategy.action(this);
        return damage;
    }

    public int E(){
        int damage = EStrategy.action(this);
        return damage;
    }

    public int R(){
        int damage = RStrategy.action(this);
        return damage;
    }




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
