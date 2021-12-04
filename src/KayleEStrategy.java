public class KayleEStrategy implements EStrategy{

    int damage;
    @Override
    public int action(Champion kayle) {
        damage = (int)(150 + kayle.getAD() *0.3 + kayle.getAP() *0.5);
        System.out.println("System : Kayle E - 화염주문검 : "+ damage);
        System.out.println();

        return damage;


    }

    public String toString() {
        return "기본 지속 효과 : 공격 시 15/20/25/30/35(+0.1 총AD)(+0.2AP)의 추가 마법 피해를 입힙니다.\n" +
                "\n" +
                "사용 시 : 케일의 다음 공격 사거리가 증가하며 대상이 잃은 체력의 8/9/10/11/12% (+주문력 50당 1%)만큼 추가 마법 피해를 입힙니다. 이 공격은 케일이 11레벨에 도달하면 대상에게 적중 시 폭발하여 주변 적에게 피해를 입힙니다. (사정거리: 550)";

    }

}
