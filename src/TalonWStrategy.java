public class TalonWStrategy implements SkillStrategy{
    Talon Talon;
    int damage;
    int heal;

    public TalonWStrategy(Talon Talon){
        this.Talon = Talon;
    }
    @Override
    public int action() {

        if (Talon.Mana < 75){
            System.out.println("System : 마나가 부족합니다");
            return 0;

        }else {
            damage = (int) (80 + Talon.getAD() * 0.4 + 170 + Talon.getAD() * 0.8);
            System.out.println("System : Talon W - 갈퀴손 : " + damage);
            System.out.println();

            Talon.TalonPassiveStack++;
            Talon.Mana -= 75;
            return damage;

            }

        }
    public String toString(){

        return "탈론이 부메랑 단검을 여러 개 던져 물리 피해를 입힙니다. 이후 단검이 돌아오며 물리 피해를 입히고 1초 동안 둔화시킵니다." ;

    }

    }



