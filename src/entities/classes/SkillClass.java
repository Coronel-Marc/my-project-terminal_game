package entities.classes;

import entities.Player;

public interface SkillClass {
    String getName();
    double bonus = 0;

    void applyBonuses(Player player);
}
