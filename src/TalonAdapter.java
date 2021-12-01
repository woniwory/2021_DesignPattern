public class TalonAdapter extends Adapter {
    int damage = 0;

    Sylas Sylas;
    Champion champion;

    public TalonAdapter(Sylas Sylas, Champion champion){
        this.champion = champion;
        this.Sylas = Sylas;
    }


    @Override
    public int action() {

        Talon Talon = (Talon) champion; // 다운캐스팅
        Talon.AD = (int)(0.6 * Sylas.getAD()); // 계수 조정
        damage += Talon.R();
        Talon.Mana = Talon.getMax_Mana();
        System.out.println("System : Sylas가 강탈한 Talon의 궁극기를 사용했습니다 !");
        return damage;

    }
}



