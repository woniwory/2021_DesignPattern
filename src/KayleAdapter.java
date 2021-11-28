

public class KayleAdapter implements SkillStrategy {

    KayleRStrategy KayleRStrategy;

    @Override
    public int action() {
        System.out.println("뺏은 Kayle의 궁극기");
        KayleRStrategy.action();
        return 0;
    }
}



