public class TalonPassiveStrategy  implements PassiveStrategy{

    int damage;

    @Override
    public int action(Champion Talon) {

            damage = (int) (Talon.getAD() * 2.0);
            System.out.println("System : Talon Passive - 검의 최후 : " + damage);
            System.out.println();

            return damage;


    }

    public String toString(){

        return " 탈론이 챔피언이나 대형 정글 몬스터에게 스킬을 사용해 피해를 입히면 중첩을 적용합니다.(최대 3회 중첩)\n";

    }


}


