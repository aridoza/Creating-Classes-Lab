package com.ga;

public class Main {

    public static void main(String[] args) {

        //Instantiate new Animal
        Animal animal = new Animal(4, 12, false, "Peaches", "Tiger");

        String name = "Kiara";
        int topSpeed = 7;

        //get name and speed values using getters
        name = animal.getName();
        topSpeed = animal.getTopSpeed();

        //Print some output
        System.out.println(name);
        System.out.println(topSpeed);

        //Set new name, speed, and endangered properties values using setters
        animal.setName("Kiara");
        animal.setTopSpeed(4);
        animal.setEndangered(true);


        //get new values using getters
        name = animal.getName();
        topSpeed = animal.getTopSpeed();

        //Print some output
        System.out.println(name);
        System.out.println(topSpeed);
        System.out.println(animal.topSpeedStats());
        System.out.println(animal.moreStats());
    }
}

