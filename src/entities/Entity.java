package entities;

public interface Entity {
    String name = "";
    double health = 0;
    double stamina = 0 ;
    double baseDamage = 0;

    String getName();
    double getHealth();
    double getStamina();
    double getBaseDamage();

}
