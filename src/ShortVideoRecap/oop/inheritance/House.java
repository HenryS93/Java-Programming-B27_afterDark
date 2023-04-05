package ShortVideoRecap.oop.inheritance;

public class House {

    public static void main (String [] args){

        /*
        All of the objects created in this class contain the same information as the Parent (Animal) Class including their own unique "Instance Variables"
        & or "Methods".
         */

        System.out.println("------------Cat Object Starts-----------");


        Cat cat = new Cat();
        cat.name = "Bucky";
        cat.age = 4;
        cat.breed = "Scottish Fold";
        cat.size = "Medium";
        cat.color = "White";
        cat.gender = 'M';
        cat.scratch(); // -> this is an unique "Method" for the cat object ONLY!.
        cat.sleep(); // -> this Method is Inherited from Animal class
        System.out.println(cat); // This will print the object itself with all of the added fields we entered to the "Instance Variables" + "Methods"

        System.out.println("------------Cat Object Ends-----------");

        System.out.println("------------Fish Object Starts-----------");


        Fish fish = new Fish();
        fish.name ="Nemo";
        fish.breed = "Clown Fish";
        fish.age = 1;
        fish.size = "Small";
        fish.color = "Orange";
        fish.gender = 'M';
        fish.swim();// -> this is an unique "Method" for the fish object ONLY!
        fish.sleep(); // -> this Method is Inherited from Animal class
        System.out.println(fish);// This will print the object itself with all of the added fields we entered to the "Instance Variables" + "Methods"

        System.out.println("------------Fish Object Ends-----------");

        System.out.println("------------Dog Object Starts-----------");


        Dog dog = new Dog();
        dog.name = "Brooklyn";
        dog.age = 2;
        dog.color = "Brown";
        dog.breed = "Spaniard";
        dog.gender = 'M';
        dog.size = "Large";
        dog.bark(); // -> this is an unique "Method" for the dog object ONLY!
        dog.sleep(); // -> this Method is Inherited from Animal class
        System.out.println(dog);// This will print the object itself with all of the added fields we entered to the "Instance Variables" + "Methods"

        System.out.println("------------Dog Object Ends-----------");




    }
}
