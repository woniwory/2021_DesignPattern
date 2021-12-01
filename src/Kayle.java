public class Kayle extends Champion {


    int Max_Mana = 1180;
    int Max_HP = 2045;
    String name = "Kayle";
    int Lv = 18;
    int HP = 2045;
    int Mana = 1180;
    int AD = 92;
    int AP = 92;

    public Kayle(PassiveStrategy PassiveStrategy, QStrategy QStrategy, WStrategy WStrategy, EStrategy EStrategy, RStrategy RStrategy) {
        super(PassiveStrategy, QStrategy, WStrategy, EStrategy, RStrategy);
    }

    public int Passive(){
        int damage = super.Passive();
        return damage;
    }

    public int Q() {
        if (this.getMana() < 70) {
            System.out.println("System : 마나가 부족합니다");
            return 0;
        } else {
            int damage = super.Q();
            this.Mana -= 70;
            return damage;
        }
    }

    public int W() {
        if (this.getMana() < 90) {
            System.out.println("System : 마나가 부족합니다");
            return 0;
        } else {
            int damage = super.W();
            this.Mana -= 90;
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
            return damage;
        }
    }


    @Override
    public String toString(){ return ("당신의 Champion은 "+ getName()+"입니다 - Lv : "+getLv()); }

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



}
