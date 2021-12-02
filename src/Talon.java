public class Talon extends Champion {

    int TalonPassiveStack = 0;



    public Talon(PassiveStrategy PassiveStrategy, QStrategy QStrategy, WStrategy WStrategy, EStrategy EStrategy, RStrategy RStrategy) {
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

    public int Passive(){
        if (this.getTalonPassiveStack() < 3) {
            return this.getAD();

        }  else if (this.getTalonPassiveStack() >= 3) {
            int damage = super.Passive();
            this.TalonPassiveStack = 0;
            return damage;
        }
        return 0;
    }

    public int Q() {
        if (this.getMana() < 40) {
            System.out.println("System : 마나가 부족합니다");
            return 0;
        } else {
            int damage = super.Q();
            this.Mana -= 40;
            TalonPassiveStack++;
            return damage;
        }
    }

    public int W() {
        if (this.getMana() < 75) {
            System.out.println("System : 마나가 부족합니다");
            return 0;
        } else {
            int damage = super.W();
            this.Mana -= 75;
            TalonPassiveStack += 2;
            return damage;
        }
    }

    public int E(){
        int damage = super.E();
        return damage;
    }

    public int R(){
        if (this.getMana() < 100){
            System.out.println("System : 마나가 부족합니다");
            return 0;
        }
        else {
            int damage = super.R();
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
