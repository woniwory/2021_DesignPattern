public class SylasWStrategy implements SkillStrategy{
    Sylas sylas;
    int damage;
    int heal;

    public SylasWStrategy(Sylas sylas){
        this.sylas = sylas;
    }
    @Override
    public int action() {
        damage = (int)(210 + sylas.getAP()*0.9);
        heal = (int)(125 + sylas.getAP() * 0.4);
        System.out.println("Sylas W - 국왕시해자 : "+ damage);


        if ( heal + sylas.getHP()  >= sylas.getMax_HP()){
        sylas.HP = 2045;
        System.out.println("Sylas W - 국왕시해자 : "+"현재 최대 체력으로 회복되었습니다");
    }
        else {
        sylas.HP = sylas.getHP() + heal;
        System.out.println("Sylas W - 국왕시해자 : "+"당신의 체력은 " + heal + "만큼 회복되었습니다");
    }

    sylas.Mana -= 100;
        return damage;

    }
}


