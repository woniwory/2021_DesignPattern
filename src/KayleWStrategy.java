public class KayleWStrategy implements WStrategy{
    Champion kayle;
    int heal;

    @Override
    public int action(Champion kayle) {

            heal = (int) (180 + kayle.getAP() * 0.3);
            System.out.println("System : Kayle W - 천상의 축복 : " + heal);

            if (kayle.HP + heal >= 2045) {
                kayle.HP = 2045;
                System.out.println("현재 최대 체력으로 회복되었습니다");
                System.out.println();

            } else {
                kayle.HP = kayle.HP + heal;
                System.out.println("당신의 체력은 " + heal + "만큼 회복되었습니다");
                System.out.println();


            }


        return heal;


    }

    public String toString(){
        return "케일과 대상 아군 챔피언이 체력을 회복합니다. ";

    }
}
