public class TalonAdapter extends Adapter {
    int damage = 0;

    Talon DummyTalon;
    TalonAdapter(Talon Talon){
        this.DummyTalon  = Talon;
    }

    @Override
    public int action() {
        TalonRStrategy TalonR = new TalonRStrategy(DummyTalon);
        damage += TalonR.action();
        DummyTalon.Mana = DummyTalon.getMax_Mana();
        System.out.println("System : Sylas가 강탈한 Talon의 궁극기를 사용했습니다 !");
        return damage;

    }
}



