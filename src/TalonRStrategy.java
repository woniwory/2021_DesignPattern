public class TalonRStrategy implements RStrategy{
    Talon Talon;
    int damage;
    public TalonRStrategy(Talon Talon){
        this.Talon = Talon;
    }
    @Override
    public int action() {
        if (Talon.Mana < 100){
            System.out.println("System : 마나가 부족합니다");
            return 0;
        }
        else {
            damage = (int) (180 + Talon.getAD() * 1.0 + 360 + Talon.getAD() * 2.0);
            System.out.println("System : Talon R - 그림자 공격 : " + damage);
            System.out.println("다음 2초동안, 당신은 은신상태입니다 ! ");
            System.out.println();
            Talon.TalonPassiveStack++;
            Talon.Mana -= 100;

            return damage;
        }
    }

    public String toString(){

        return " 탈론이 사방에 검을 던져 물리 피해를 입히고, 이동 속도가 상승하며 최대 2.5초 동안 투명 상태가 됩니다. 투명 상태가 끝나면 검이 탈론에게 돌아오며 다시 물리 피해를 입힙니다.\n" +
                "\n" +
                "탈론이 기본 공격이나 녹서스식 외교 스킬로 투명 상태를 해제하면 검이 탈론 대신 탈론의 대상에게 날아갑니다." ;

    }

}


