package org.fasttrackit;

import java.util.Date;

public class App 
{
    public static void main( String[] args )
    {
        Date expirationDate = new Date();

        AnimalFood food = new AnimalFood("Purina", 15.0, 10.0, expirationDate, 50);
        AnimalFood favoriteFood = new AnimalFood("Purina", 20.0, 15.0, expirationDate, 30);
        Activity activity = new Activity("running");
        Activity favoriteActivity = new Activity("running");
        Animal dog = new Animal("Odin", 3, 10, 2, 9, favoriteFood, favoriteActivity);
        Rescuer rescuer = new Rescuer("Andrei", 1.000);
        Veterinary vet = new Veterinary("Popescu", "Chirurgie veterinara");
        Game game = new Game(rescuer, dog, vet);

        //rescuer.feed(dog, food);
        rescuer.activity(dog, activity);

        System.out.println(dog.hungerLevel + " " + dog.spiritLevel);
    }
}
