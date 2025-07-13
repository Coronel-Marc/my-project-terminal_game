package entities.classes;

import entities.Entity;

public interface SkillClass {
    String getClassName();
    double getBaseAttack(double attack);
    double getBaseDefense(double defense);
    void useBaseAttack(Entity target);
}
