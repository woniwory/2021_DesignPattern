public class KayleRStrategy implements RStrategy{

    int damage = 0;
        @Override
        public int action(Champion kayle) {

                damage = (int) (300 + kayle.getAD() * 1.0 + kayle.getAP() * 0.8);
                System.out.println("System : Kayle R - 신성한 심판 : " + damage);
                System.out.println("다음 2초동안, 당신은 무적입니다 ! ");
                System.out.println();

                return damage;
            }


        public String toString(){

            return " 케일이 아군 챔피언 한 명을 2초 동안 무적 상태로 만듭니다.\n" +
                    "\n" +
                    "시전 시간이 끝나면 대상 주위 지역을 정화해 주변 적에게 마법 피해를 입힙니다. ";
        }

    }


