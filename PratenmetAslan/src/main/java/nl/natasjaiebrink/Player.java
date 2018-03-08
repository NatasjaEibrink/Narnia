package nl.natasjaiebrink;

public class Player {

    private String name;

    private int experiencePoints;

    private int strenght;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player (String name, int experiencePoints, int strenght) {
        this.name = name;
        this.experiencePoints= experiencePoints;
        this.strenght= strenght;
    }


}
