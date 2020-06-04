package org.fasttrackit;

public class Animal {

    String name;
    int age;
    int healthLevel;
    int hungerLevel;
    int spiritLevel;
    AnimalFood favoriteFood;
    Activity favoriteActivity;

    Animal(String name, int age, int healthLevel, int hungerLevel, int spiritLevel,
           AnimalFood favoriteFood, Activity favoriteActivity) {
        this.name = name;
        this.age = age;
        this.healthLevel = healthLevel;
        this.hungerLevel = hungerLevel;
        this.spiritLevel = spiritLevel;
        this.favoriteFood = favoriteFood;
        this.favoriteActivity = favoriteActivity;
    }

}
