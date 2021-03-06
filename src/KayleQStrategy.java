public class KayleQStrategy implements QStrategy{

    int damage = 0;

    @Override
    public int action(Champion kayle) {
        if (kayle.getMana() < 70){
            System.out.println("System : 마나가 부족합니다");
            return 0;

        }
        else {
            damage = (int) (220 + kayle.getAD() * 0.6 + kayle.getAP() * 0.5);
            System.out.println("System : Kayle Q - 광휘의 일격 : " + damage);
            System.out.println();
            return damage;
        }

    }

    public String toString(){
        return "케일이 처음으로 적을 맞히면 멈추는 천상의 검을 소환하여 대상과 그 뒤에 있는 적들에게  마법 피해를 입힙니다." ;
    }

}
