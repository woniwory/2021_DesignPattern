public class KayleRStrategy implements SkillStrategy{
    Kayle kayle;
    int damage;
    public KayleRStrategy(Kayle kayle){
        this.kayle = kayle;
    }
        @Override
        public int action() {

            damage = (int)(300 + kayle.AD*1.0 + kayle.AP*0.8);
            System.out.println("Kayle R - 신성한 심판 : "+ damage);
            System.out.println("다음 2초동안, 당신은 무적입니다 ! ");
            System.out.println();

            return damage;
        }

        public String toString(){

            return " 케일이 아군 챔피언 한 명을 2초 동안 무적 상태로 만듭니다.\n" +
                    "\n" +
                    "시전 시간이 끝나면 대상 주위 지역을 정화해 주변 적에게 200/350/500(+1.0 추가AD)(+0.8AP)의 마법 피해를 입힙니다. (사정거리: 900, 범위: 500)";
        }

    }


