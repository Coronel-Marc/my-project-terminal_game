package entities;

public class Enemy extends Entity {
    /*
    String name;
    double health, stamina, baseDamage;
    */

    @Override
    public String getName() {

        return name;
    }

    @Override
    public double getHealth() {

        return health;
    }

    @Override
    public double getStamina() {

        return stamina;
    }

    @Override
    public double getBaseDamage() {

        return baseDamage;
    }
    /*
    public Enemy (String name, double health, double stamina, double baseDamage){
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.baseDamage = baseDamage;
    }
    */

    public Enemy(){
        this.name = "Unknown";
        this.health = 50;
        this.stamina = 80;
        this.baseDamage = 10;
    }

    @Override
    public String greeting(){
        return "Hi! I'm " + name;
    }
}
