package com.ga;

public class Animal {
    private int numLegs;
    private int topSpeed;
    private boolean isEndangered;
    private String name;
    private String type;

//    public Animal(int numLegs, int topSpeed, boolean isEndangered, String name, String type){
//        //Set properties here
//        this.numLegs = numLegs;
//        this.topSpeed = topSpeed;
//        this.isEndangered = isEndangered;
//        this.name = name;
//        this.type = type;
//
//    }
    //Put getters and setters here
    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String topSpeedStats() {
        return "The " + type + " has a top speed of " + topSpeed + "mph.";
    }

    public String moreStats() {
        return name + " is a " + type + " with " + numLegs + " legs.";
    }

    public String showAnimalInfo() {
        return "Great! Your new pet is named " + name + " and is of type " + type + ". It has " + numLegs
                + " legs and its top speed is " + topSpeed + "mph.";
    }

    @Override
    public String toString() {
        return "The " + type + " has a top speed of " + topSpeed + "mph.";
    }
}

