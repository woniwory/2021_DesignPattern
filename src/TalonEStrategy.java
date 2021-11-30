public class TalonEStrategy implements EStrategy{
    Talon Talon;
    int damage;
    public TalonEStrategy(Talon Talon){
        this.Talon = Talon;
    }
    @Override
    public int action() {
        damage = 0;
        System.out.println("System : Talon E - 암살자의 길 : "+ damage);
        System.out.println();

        return damage;


    }

    public String toString() {
        return "탈론이 가장 가까운 지형이나 구조물 위로 도약해 뛰어넘습니다. 한 번 넘어간 지형은 일정 시간 동안 다시 넘을 수 없습니다.\n";

    }

}
