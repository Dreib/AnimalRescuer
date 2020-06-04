package org.fasttrackit;

public class Rescuer {

    String name;
    double budget;

    Rescuer(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    public void feed(Animal animal, AnimalFood food) {

        if(food.name.equals(animal.favoriteFood.name)) {
            animal.spiritLevel++;
            System.out.println(animal.spiritLevel);
        }
        else {
            System.out.println(this.name + " just gave some " + food.name + " food to " + animal.name + ".");
            animal.hungerLevel--;
        }
    }

    public void activity(Animal animal, Activity activity) {

        if(activity.name.equals(animal.favoriteActivity.name)) {
            animal.spiritLevel += 2;
            System.out.println(animal.spiritLevel);
        }
        else {
            System.out.println(this.name + " just took " + animal.name + " out for a " + activity.name + ".");
            animal.spiritLevel++;
        }
    }

}
