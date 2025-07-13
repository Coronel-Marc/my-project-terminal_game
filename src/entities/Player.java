package entities;


public class Player extends Entity{
    protected String classHability;

    protected int level;


    public String getClassHability(){
        return classHability;
    }

    public void setClassHability(String classHability) {
        this.classHability = classHability;
    }


}
