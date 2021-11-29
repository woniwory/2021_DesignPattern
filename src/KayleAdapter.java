public class KayleAdapter extends Adapter {
    int damage = 0;

    Kayle DummyKayle;
    KayleAdapter(Kayle kayle){
        this.DummyKayle  = kayle;
    }

    @Override
    public int action() {
        KayleRStrategy KayleR = new KayleRStrategy(DummyKayle);
        damage += KayleR.action();
        DummyKayle.Mana = DummyKayle.getMax_Mana();
        System.out.println("System : Sylas가 강탈한 Kayle의 궁극기를 사용했습니다 !");
        return damage;

    }
}



