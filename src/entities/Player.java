package entities;




public class Player implements Entity {
    private String name;
    private double health;
    private double stamina;
    private double baseDamage;


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

    public Player (String name, double health, double stamina, double baseDamage) {
        this.name = name;

    }

}
