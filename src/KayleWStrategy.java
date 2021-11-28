public class KayleWStrategy implements SkillStrategy{
    Kayle kayle;
    int heal;

    public KayleWStrategy(Kayle kayle){
        this.kayle = kayle;
    }
    @Override
    public int action() {
        heal = (int)(180 + kayle.AP*0.3);
        System.out.println("Kayle W - 천상의 축복 : "+ heal);

        if (kayle.HP + heal >= 2045){
            kayle.HP = 2045;
            System.out.println("현재 최대 체력으로 회복되었습니다");
            System.out.println();

        }
        else {
            kayle.HP = kayle.HP + heal;
            System.out.println("당신의 체력은 " + heal + "만큼 회복되었습니다");
            System.out.println();

        }

        kayle.Mana -= 90;
        return heal;


    }

    public String toString(){
        return "케일과 대상 아군 챔피언이 60/90/120/150/180(+0.3 AP)의 체력을 회복하고 2초 동안 이동 속도가 24/28/32/36/40%(+0.08 AP) 증가합니다. (사정거리: 900)";

    }
}
