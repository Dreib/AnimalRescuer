package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal dog = new Animal();
        Activity activity = new Activity();
        AnimalFood animalFood = new AnimalFood();
        Rescuer rescuer = new Rescuer();
        Veterinary vet = new Veterinary();
        Game game = new Game();

        dog.age = 3;
        dog.name = "Odin";
        dog.healthLevel = 10;
        dog.hungerLevel = 1;
        dog.spiritLevel = 10;


    }
}
