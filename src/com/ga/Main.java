package com.ga;

import java.util.*;

import static java.lang.Boolean.parseBoolean;
import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        //createAnimal();

        //Instantiate new Animal
        Animal animal = new Animal();

        animal.setName("Kiara");
        animal.setType("Tiger");
        animal.setTopSpeed(7);
        animal.setNumLegs(4);

        //get name and speed values using getters
        String name = animal.getName();
        int topSpeed = animal.getTopSpeed();

        //Print some output
        System.out.println(name);
        System.out.println(topSpeed);

        //Set new name, speed, and endangered properties values using setters
        animal.setName("Bobby");
        animal.setType("Elephant");
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
        System.out.println(animal.showAnimalInfo());
    }

    public static void createAnimal() {
        // create new instance of Animal class
        Animal myAnimal = new Animal();

        // create a new scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // get the animal type from user
        System.out.println("What kind of pet do you want?");
        myAnimal.setType(scanner.nextLine());

        // get animal name from user
        System.out.println("What is your new pet's name?");
        myAnimal.setName(scanner.nextLine());

        // get animal number of legs from user
        System.out.println("How many legs does your animal have?");
        myAnimal.setNumLegs(parseInt(scanner.nextLine()));

        // get animal top speed from user
        System.out.println("What is "+ myAnimal.getName() +"'s top speed?");
        myAnimal.setTopSpeed(parseInt(scanner.nextLine()));

        // get animal endangered status from user
        System.out.println("Is " + myAnimal.getName() + " endangered? Please enter true or false.");
        myAnimal.setEndangered(parseBoolean(scanner.nextLine()));

        System.out.println("Great! Your new pet is named " + myAnimal.getName() + " and is of type " + myAnimal.getType() + ". It has " + myAnimal.getNumLegs()
                + " legs and its top speed is " + myAnimal.getTopSpeed() + "mph.");
    }
}

