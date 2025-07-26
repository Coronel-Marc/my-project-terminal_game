package entities.classes;

import entities.Player;

public class Warrior implements SkillClass{


    @Override
    public String getName() {
        return "Warrior";
    }

    @Override
    public void applyBonuses(Player player) {
        double healthBonus = 30;
        double staminaBonus = 10;
        double damageBonus = 50;

        player.setHealth(player.getHealth() + healthBonus);
        player.setStamina(player.getStamina() + staminaBonus);
        player.setBaseDamage(player.getBaseDamage() + damageBonus);

    }
}
