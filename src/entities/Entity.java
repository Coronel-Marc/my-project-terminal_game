package entities;

public abstract class Entity {
    String name = "";
    double health = 0;
    double stamina = 0 ;
    double baseDamage = 0;

    String getName() {
        return name;
    }

    double getHealth() {
        return health;
    }

    double getStamina() {
        return stamina;
    }

    double getBaseDamage() {
        return baseDamage;
    }
    String greeting(){
        return "Hi! I'm" + name;
    }
}
