public class SylasQStrategy implements SkillStrategy{
    Sylas sylas;
    int damage = 0;

    public SylasQStrategy(Sylas sylas){
        this.sylas = sylas;
    }
    @Override
    public int action() {
        System.out.println("Sylas Q!");
        System.out.println(sylas.AP + 10);
        return 0;

    }
}


