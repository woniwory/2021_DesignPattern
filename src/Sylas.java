public class Sylas extends Champion {


    public void action(SkillStrategy skillStrategy){
        skillStrategy.action();
    }

    int Max_Mana = 2480;
    int Max_HP = 1500;
    String name = "Sylas";
    int Lv = 18;
    int HP = 2480;
    int Mana = 1500;
    int AD = 112;
    int AP = 112;

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
