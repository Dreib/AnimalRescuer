package org.fasttrackit;

public class Rescuer {

    String name;
    double budget;

    Rescuer(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    public void feed(Animal animal, AnimalFood food) {
        System.out.println(this.name + " just gave some " + food.name + " food to " + animal.name + ".");
        animal.hungerLevel--;
    }

    public void activity(Animal animal, Activity activity) {
        System.out.println(this.name + " just took " + animal.name + " out for a " + activity.name + ".");
        animal.spiritLevel++;
    }

}
