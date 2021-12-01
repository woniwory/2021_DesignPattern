public class KayleAdapter extends Adapter {
    int damage = 0;

    Sylas Sylas;
    Champion champion;

    public KayleAdapter(Sylas Sylas, Champion champion){
        this.champion = champion;
        this.Sylas = Sylas;
    }


    @Override
    public int action() {

        Kayle kayle = (Kayle) champion; // 다운캐스팅
        kayle.AD = (int)(0.6 * Sylas.getAD()); // 계수 조정
        kayle.AP = Sylas.getAP();
        damage += kayle.R();
        kayle.Mana = kayle.getMax_Mana();
        System.out.println("System : Sylas가 강탈한 Kayle의 궁극기를 사용했습니다 !");
        return damage;

    }
}



