package org.fasttrackit;

import java.util.Date;

public class App 
{
    public static void main( String[] args )
    {
        Date expirationDate = new Date();

        AnimalFood favoriteFood = new AnimalFood("Pedigree", 15.0, 10.0, expirationDate, 50);
        Activity favoriteActivity = new Activity("Walking");
        Animal dog = new Animal("Odin", 3, 10, 2, 9, favoriteFood, favoriteActivity);
        Rescuer rescuer = new Rescuer("Andrei", 1.000);
        Veterinary vet = new Veterinary("Popescu", "Chirurgie veterinara");
        Game game = new Game(rescuer, dog, vet);

    }
}
