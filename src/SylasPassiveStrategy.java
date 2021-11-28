public class SylasPassiveStrategy  implements SkillStrategy{
    Sylas sylas;

    int damage;
    public SylasPassiveStrategy(Sylas sylas){
        this.sylas = sylas;
    }
    @Override
    public int action() {
        if (sylas.getSylasPassiveStack() <= 0) {
            sylas.SylasPassiveStack = 0;
            System.out.println("Sylas 기본공격: "+sylas.getAD());
            return sylas.getAD();

        } else if (sylas.getSylasPassiveStack() <= 3){
            damage = (int) (sylas.getAD() * 1.3 + sylas.getAP() * 0.25);
            System.out.println("Sylas Passive - 패트리사이트 폭발: " + damage);
            System.out.println();
            sylas.SylasPassiveStack -= 1;
            return damage;
        }
        else{
            sylas.SylasPassiveStack = 3;
            damage = (int) (sylas.getAD() * 1.3 + sylas.getAP() * 0.25);
            System.out.println("Sylas Passive - 패트리사이트 폭발: " + damage);
            System.out.println();
            sylas.SylasPassiveStack -= 1;
            return damage;
        }

        }

    public String toString(){

        return " 킬 사용 후 사일러스가 페트리사이트 폭발을 1회 충전합니다. (최대 충전량 3회) 다음 기본 공격 시 충전량을 하나 소모하여 사슬을 휘두르며 \n" +
                "\n" +
                "적중당한 대상에게 마법 피해를 입히고 대상 주변의 모든 적에게 감소한 마법 피해를 입힙니다. ";
    }


    }


