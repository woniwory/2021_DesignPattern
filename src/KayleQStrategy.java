public class KayleQStrategy implements SkillStrategy{
    Kayle kayle;
    int damage = 0;

    public KayleQStrategy(Kayle kayle){
        this.kayle = kayle;
    }
    @Override
    public int action() {

            damage = (int)(220 + kayle.getAD()*0.6 + kayle.getAP()*0.5);
            System.out.println("Kayle Q - 광휘의 일격: "+ damage);
            System.out.println();
            kayle.Mana -= 70;
            return damage;

    }

    public String toString(){
        return "케일이 처음으로 적을 맞히면 멈추는 천상의 검을 소환합니다.\n" +
                "\n" +
                "검은 대상과 그 뒤에 있는 적들에게 60/100/140/180/220(+0.6 추가AD)(+0.5AP)의 마법 피해를 입히고 2초 동안 26/32/38/44/50%만큼 둔화시키며 방어력과 마법 저항력을 4초 동안 15%만큼 낮춥니다. (사정거리: 900)";
    }

}
