public class Kayle extends Champion {

    public Kayle(PassiveStrategy PassiveStrategy, QStrategy QStrategy, WStrategy WStrategy, EStrategy EStrategy, RStrategy RStrategy) {
        super(PassiveStrategy, QStrategy, WStrategy, EStrategy, RStrategy);
        Max_Mana = 1180;
        Max_HP = 2045;
        name = "Kayle";
        Lv = 18;
        HP = 2045;
        Mana = 1180;
        AD = 92;
        AP = 92;
    }

    @Override
    public int Passive(){
        int damage = PassiveStrategy.action(this);
        return damage;
    }

    @Override
    public int Q() {
        if (this.getMana() < 70) {
            System.out.println("System : 마나가 부족합니다");
            return 0;
        } else {
            int damage = QStrategy.action(this);
            this.Mana -= 70;
            return damage;
        }
    }

    @Override
    public int W() {
        if (this.getMana() < 90) {
            System.out.println("System : 마나가 부족합니다");
            return 0;
        } else {
            int damage = WStrategy.action(this);
            this.Mana -= 90;
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



}
