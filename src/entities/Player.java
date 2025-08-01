package entities;


public class Player extends Entity{

    /*
    String name;
    double health;
    double stamina;
    double baseDamage;
    */

    @Override
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getHealth() {
        return health;
    }
    public void setHealth(double health){
        this.health = health;
    }

    @Override
    public double getStamina() {
        return stamina;
    }
    public void setStamina(double stamina) {
        this.stamina = stamina;
    }

    public void setBaseDamage(double baseDamage) {
        this.baseDamage = baseDamage;
    }

    /*
    public Player (String name, double health, double stamina, double baseDamage){
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.baseDamage = baseDamage;
    }*/

    public Player(){
        this.name = "Wanderer";
        this.health = 80;
        this.stamina = 80;
        this.baseDamage = 9;
    }

    @Override
    public String greeting(){
        return "Hi! I'm " + name;
    }

    public String toPunch(double damage, Entity target){
        target.getHit(damage);
        return "Punching " + target.getName();
    }
}
