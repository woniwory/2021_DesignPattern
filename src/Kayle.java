public class Kayle extends Champion {

    String PassiveDescription = "챔피언 및 스킬 레벨이 오를수록 케일의 공격이 강화됩니다.\n" +
            "\n" +
            "1레벨 - 영광 : 기본 공격 시 공격 속도가 5초 동안 6(+주문력의 1%)% 증가합니다.(최대 5회 중첩) 최대 중첩 시 희열 상태가 되며 이동 속도가 8% 증가합니다.\n" +
            "\n" +
            "6레벨 - 비상 : 공격 사거리가 525까지 늘어납니다.\n" +
            "\n" +
            "11레벨 - 작열 : 희열 상태 공격 시 화염파를 발사해 15/20/25/30/35(+0.25AP)(+0.1 추가AD) 마법 피해를 입힙니다.\n" +
            "\n" +
            "16레벨 - 승천 : 영구히 희열 상태를 유지하며 공격 사거리가 625까지 늘어납니다.";






    public void action(SkillStrategy skillStrategy){
        skillStrategy.action();
    }

    int Max_Mana = 1180;
    int Max_HP = 2045;
    String name = "Kayle";
    int Lv = 18;
    int HP = 2045;
    int Mana = 1180;
    int AD = 92;
    int AP = 92;

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
