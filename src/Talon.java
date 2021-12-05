public class Talon extends Champion {

    int TalonPassiveStack = 0;



    public Talon(PassiveStrategy PassiveStrategy, QStrategy QStrategy, WStrategy WStrategy,
                 EStrategy EStrategy, RStrategy RStrategy) {
        super(PassiveStrategy, QStrategy, WStrategy, EStrategy, RStrategy);

        Max_HP = 2203;
        Max_Mana = 1006;
        name = "Talon";
        Lv = 18;
        HP = 2203;
        Mana = 1006;
        AD = 140;
        AP = 0;
    }

    @Override
    public int Passive(){
        if (this.getTalonPassiveStack() < 3) {
            return this.getAD();

        }  else if (this.getTalonPassiveStack() >= 3) {
            int damage = PassiveStrategy.action(this);
            this.TalonPassiveStack = 0;
            return damage;
        }
        return 0;
    }

    @Override
    public int Q() {
        if (this.getMana() < 40) {
            System.out.println("System : 마나가 부족합니다");
            return 0;
        } else {
            int damage = QStrategy.action(this);
            this.Mana -= 40;
            TalonPassiveStack++;
            return damage;
        }
    }

    @Override
    public int W() {
        if (this.getMana() < 75) {
            System.out.println("System : 마나가 부족합니다");
            return 0;
        } else {
            int damage = WStrategy.action(this);
            this.Mana -= 75;
            TalonPassiveStack += 2;
            return damage;
        }
    }

    @Override
    public int E(){
        int damage = EStrategy.action(this);
        return damage;
    }

    @Override
    public int R(){
        if (this.getMana() < 100){
            System.out.println("System : 마나가 부족합니다");
            return 0;
        }
        else {
            int damage = RStrategy.action(this);
            this.Mana -= 100;
            TalonPassiveStack++;
            return damage;
        }
    }

    @Override
    public String toString(){ return ("당신의 Champion은 "+ this.getName()+"입니다 - Lv : "+this.getLv()); }

    @Override
    public String getName(){ return name; }

    @Override
    public int getLv(){
        return Lv;
    }

    @Override
    public int getHP(){
        return HP;
    }

    @Override
    public int getMana(){
        return Mana;
    }

    @Override
    public int getAD(){
        return AD;
    }

    @Override
    public int getAP(){ return AP; }

    @Override
    public int getMax_HP(){ return Max_HP; }

    @Override
    public int getMax_Mana(){ return Max_Mana; }

    public int getTalonPassiveStack() { return TalonPassiveStack; }



}
