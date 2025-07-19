package entities.classes;

public interface SkillClass {
    double damage = 0;
    String getClassName();
    double getBaseAttack(double attack);
    double getBaseDefense(double defense);
}
