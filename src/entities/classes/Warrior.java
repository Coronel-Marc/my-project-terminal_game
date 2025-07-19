package entities.classes;

public class Warrior implements SkillClass{

    @Override
    public String getClassName() {
        return "";
    }

    @Override
    public double getBaseAttack(double attack) {
        return 0;
    }

    @Override
    public double getBaseDefense(double defense) {
        return 0;
    }

    @Override
    public void useBaseAttack(Entity target) {

    }
}
