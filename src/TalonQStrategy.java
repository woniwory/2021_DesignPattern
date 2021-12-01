public class TalonQStrategy implements QStrategy{
    int damage = 0;

    @Override
    public int action(Champion Talon) {

            damage = (int) (Talon.getAD() * 1.5);
            System.out.println("System : Talon Q - 녹서스식 외교 : "+damage);
            System.out.println();
            return damage;

        }




    public String toString(){
        return "탈론이 대상에게 도약해 물리 피해를 입힙니다." ;

    }
}


