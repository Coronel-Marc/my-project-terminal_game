package entities;

public class Entity {
    protected String name;

    protected double health;
    protected double shield;
    protected double stamina;

    protected double attack;
    protected double defense;

    protected double experience;
    protected double initiative;

    //  Stamina
    public double getStamina() {
        return stamina;
    }
    public void setStamina(double stamina) {
        this.stamina = stamina;
    }

    //  Defense
    public double getDefense() {
        return defense;
    }
    public void setDefense(double defense) {
        this.defense = defense;
    }

    //  Experience
    public double getExperience() {
        return experience;
    }
    public void setExperience(double experience) {
        this.experience = experience;
    }

    //  Initiative
    public double getInitiative() {
        return initiative;
    }
    public void setInitiative(double initiative) {
        this.initiative = initiative;
    }

    //  Health
    public double getHealth() {
        return health;
    }
    public void setHealth(double health) {
        this.health = health;
    }

    //  Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //  Shield
    public double getShield() {
        return shield;
    }
    public void setShield(double shield) {
        this.shield = shield;
    }

    //  Attack
    public double getAttack() {
        return attack;
    }
    public void setAttack(double attack) {
        this.attack = attack;
    }
}
