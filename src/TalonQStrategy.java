public class TalonQStrategy implements QStrategy{
    Talon Talon;
    int damage = 0;

    public TalonQStrategy(Talon Talon){
        this.Talon = Talon;
    }
    @Override
    public int action() {
        if (Talon.Mana < 40){
            System.out.println("System : 마나가 부족합니다");
            return 0;
        }else {
            damage = (int) (Talon.getAD() * 1.5);
            System.out.println("System : Talon Q - 녹서스식 외교 : "+damage);
            System.out.println();
            Talon.TalonPassiveStack++;
            Talon.Mana -= 40;
            return damage;

        }



        }
    public String toString(){
        return "탈론이 대상에게 도약해 물리 피해를 입힙니다." ;

    }
}


