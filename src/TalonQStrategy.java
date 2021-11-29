public class TalonQStrategy implements SkillStrategy{
    Talon Talon;
    int damage = 0;

    public TalonQStrategy(Talon Talon){
        this.Talon = Talon;
    }
    @Override
    public int action() {
        if (Talon.Mana < 55){
            System.out.println("System : 마나가 부족합니다");
            return 0;
        }else {
            damage = (int) (100 + Talon.getAP() * 0.4 + 180 + Talon.getAP() * 0.9);
            System.out.println("System : Talon Q - 사슬 후려치기 : "+damage);
            System.out.println();
            Talon.TalonPassiveStack++;
            Talon.Mana -= 55;
            return damage;

        }



    }
}


