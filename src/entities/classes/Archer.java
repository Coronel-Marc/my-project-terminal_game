package entities.classes;

import entities.Entity;

public class Archer implements SkillClass{
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

}
