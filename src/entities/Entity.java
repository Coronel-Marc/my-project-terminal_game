package entities;

public class Entity {
    protected String name = "";
    protected double health = 0;
    protected double stamina = 0 ;
    protected double baseDamage = 0;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }
    public void setHealth(double health) {
        this.health = health;
    }

    public double getStamina() {
        return stamina;
    }
    public void setStamina(double stamina) {
        this.stamina = stamina;
    }

    public double getBaseDamage() {
        return baseDamage;
    }

    public String greeting(){
        return "Hi! I'm" + name;
    }

    public String presentYourSelf() {
        return String.format("""
                        \
                        Name: %s
                        Health: %.2f
                        Stamina: %.2f
                        Base Damage: %.2f
                        """,
                name,health,stamina,baseDamage
        );
    }

    public void getHit(double damage) {
        health -= damage;
    }

}
