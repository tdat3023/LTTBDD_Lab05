package com.example.listview;

public class Cake {
    private String name;
    private String description;
    private int flagName;
    private double cost;

    public Cake(String name, String description, int flagName,double cost) {
        this.name = name;
        this.description = description;
        this.flagName = flagName;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getFlagName() {
        return flagName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFlagName(int  flagName) {
        this.flagName = flagName;
    }

    public double getCost() {
        return  cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return this.name + "description: "+ this.description +"Cost: "+this.cost;
    }

}
