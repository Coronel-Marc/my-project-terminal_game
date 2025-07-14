package entities;


import entities.classes.Warrior;

public class Player extends Entity{
    protected String classHability;

    protected int level;

    public Player(Warrior warrior) {

    }


    public String getClassHability(){
        return classHability;
    }

    public void setClassHability(String classHability) {
        this.classHability = classHability;
    }


}
