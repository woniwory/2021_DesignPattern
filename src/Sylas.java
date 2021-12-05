public class Sylas extends Champion {
    int SylasPassiveStack = 0;
    int Estatus = 0;
    int Rstatus = 0;


    public Sylas(PassiveStrategy PassiveStrategy, QStrategy QStrategy, WStrategy WStrategy, EStrategy EStrategy, RStrategy RStrategy) {
        super(PassiveStrategy, QStrategy, WStrategy, EStrategy, RStrategy);
        Max_HP = 2480;
        Max_Mana = 1500;
        name = "Sylas";
        Lv = 18;
        HP = 2480;
        Mana = 1500;
        AD = 112;
        AP = 112;

    }

    @Override
    public int Passive(){
        if (this.getSylasPassiveStack() <= 0) {
            this.SylasPassiveStack = 0;
            return this.getAD();

        } else if (this.getSylasPassiveStack() <= 3){
            int damage = PassiveStrategy.action(this);
            this.SylasPassiveStack --;
            return damage;
        }  else {
            this.SylasPassiveStack = 3;
            this.SylasPassiveStack -= 1;
            int damage = PassiveStrategy.action(this);
            return damage;
        }

    }

    @Override
    public int Q() {
        if (this.getMana() < 55) {
            System.out.println("System : 마나가 부족합니다");
            return 0;
        } else {
            int damage = QStrategy.action(this);
            this.Mana -= 55;
            this.SylasPassiveStack++;
            return damage;
        }
    }

    @Override
    public int W() {

        if (this.getMana() < 100) {
            System.out.println("System : 마나가 부족합니다");
            return 0;

        } else {
            int damage = WStrategy.action(this);
            this.Mana -= 100;
            this.SylasPassiveStack++;
            int heal = (int) (125 + this.getAP() * 0.4);

            if (heal + this.getHP() >= this.getMax_HP()) {
                this.HP = this.Max_HP;

                System.out.println("Sylas W - 국왕시해자 : " + "현재 최대 체력으로 회복되었습니다");
            } else {
                this.HP = this.getHP() + heal;
                System.out.println("Sylas W - 국왕시해자 : " + "당신의 체력은 " + heal + "만큼 회복되었습니다");
            }

            return damage;
        }
    }

    @Override
    public int E(){

        if (this.Mana < 65){
            System.out.println("System : 마나가 부족합니다");
            return 0;
        }

        else {

            if (Estatus == 0) {

                int damage = EStrategy.action(this);
                this.Mana -= 65;
                this.SylasPassiveStack++;
                Estatus++;
                return damage;

        } else if (Estatus == 1) {

                int damage = EStrategy.action(this);
                this.SylasPassiveStack++;
                Estatus = 0;
                return damage;

            }
            return 0;
        }
    }

    @Override
    public int R(){
        if (this.getMana() < 75){
            System.out.println("System : 마나가 부족합니다");
            return 0;
        }
        else {
            if (Rstatus == 0) {
                int damage = RStrategy.action(this);
                this.Mana -= 75;
                this.SylasPassiveStack++;
                Rstatus++;
                return damage;

            } else if (Rstatus == 1) {

                int damage = RStrategy.action(this);;
                this.SylasPassiveStack++;
                Rstatus = 0;
                return damage;

            }
            return 0;
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

    public int getSylasPassiveStack() { return SylasPassiveStack; }



}
