public class TalonWStrategy implements WStrategy{

    int damage = 0;


    @Override
    public int action(Champion Talon) {

            damage = (int) (80 + Talon.getAD() * 0.4 + 170 + Talon.getAD() * 0.8);
            System.out.println("System : Talon W - 갈퀴손 : " + damage);
            System.out.println();

            return damage;



        }
    public String toString(){

        return "탈론이 부메랑 단검을 여러 개 던져 물리 피해를 입힙니다. 이후 단검이 돌아오며 물리 피해를 입히고 1초 동안 둔화시킵니다." ;

    }

    }



