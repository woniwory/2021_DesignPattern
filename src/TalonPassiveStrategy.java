public class TalonPassiveStrategy  implements SkillStrategy{
    Talon Talon;

    int damage;
    public TalonPassiveStrategy(Talon Talon){
        this.Talon = Talon;
    }
    @Override
    public int action() {
        if (Talon.getTalonPassiveStack() <= 0) {
            Talon.TalonPassiveStack = 0;
            System.out.println("Talon 기본공격: "+Talon.getAD());
            return Talon.getAD();

        } else if (Talon.getTalonPassiveStack() <= 3){
            damage = (int) (Talon.getAD() * 1.3 + Talon.getAP() * 0.25);
            System.out.println("Talon Passive - 패트리사이트 폭발: " + damage);
            System.out.println();
            Talon.TalonPassiveStack -= 1;
            return damage;
        }
        else{
            Talon.TalonPassiveStack = 3;
            damage = (int) (Talon.getAD() * 1.3 + Talon.getAP() * 0.25);
            System.out.println("Talon Passive - 패트리사이트 폭발: " + damage);
            System.out.println();
            Talon.TalonPassiveStack -= 1;
            return damage;
        }

    }

    public String toString(){

        return " 킬 사용 후 사일러스가 페트리사이트 폭발을 1회 충전합니다. (최대 충전량 3회) 다음 기본 공격 시 충전량을 하나 소모하여 사슬을 휘두르며 \n" +
                "\n" +
                "적중당한 대상에게 마법 피해를 입히고 대상 주변의 모든 적에게 감소한 마법 피해를 입힙니다. ";
    }


}


