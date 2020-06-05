package io.codedifferently;

public class fruit {

    private String type;
    private int energy;


    public fruit(String type, int energy)
    {
        this.type = type;
        this.energy = energy;
    }

    public String getType(){
        return this.type;
    }

    public int getEnergy()
    {
        return this.energy;
    }
}