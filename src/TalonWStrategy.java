public class TalonWStrategy implements SkillStrategy{
    Talon Talon;
    int damage;
    int heal;

    public TalonWStrategy(Talon Talon){
        this.Talon = Talon;
    }
    @Override
    public int action() {

        if (Talon.Mana < 100){
            System.out.println("System : 마나가 부족합니다");
            return 0;
        }else {
            damage = (int) (210 + Talon.getAP() * 0.9);
            heal = (int) (125 + Talon.getAP() * 0.4);
            System.out.println("System : Talon W - 국왕시해자 : " + damage);
            System.out.println();


            if (heal + Talon.getHP() >= Talon.getMax_HP()) {
                Talon.HP = Talon.Max_HP;
                Talon.TalonPassiveStack++;
                System.out.println("Talon W - 국왕시해자 : " + "현재 최대 체력으로 회복되었습니다");
            } else {
                Talon.HP = Talon.getHP() + heal;
                Talon.TalonPassiveStack++;
                System.out.println("Talon W - 국왕시해자 : " + "당신의 체력은 " + heal + "만큼 회복되었습니다");

            }
            Talon.Mana -= 100;
            return damage;
        }

    }
}


