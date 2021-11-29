public class Talon extends Champion {

    int TalonPassiveStack = 0;

    int Max_HP = 2203;
    int Max_Mana = 1006;
    String name = "Talon";
    int Lv = 18;
    int HP = 2203;
    int Mana = 1006;
    int AD = 140;
    int AP = 0;

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
    
    public int getTalonPassiveStack() { return TalonPassiveStack; }



}
