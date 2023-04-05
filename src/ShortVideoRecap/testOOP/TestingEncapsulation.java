package ShortVideoRecap.testOOP;

import ShortVideoRecap.oop.encapsulation.EncapsulationReview;

public class TestingEncapsulation {
    public static void main(String [] args){


        /*
        In order to Access a Instance Variable or Instance Method
        we MUST first create an object from that class
         */


        // "EncapsulationReview" -> is the name of the class and reference

        // "new" key word means the new object we're creating

        // NOTE: here we're creating an object with a reference of its self

        EncapsulationReview employee1 = new EncapsulationReview();

        /*
        getName2() is a "PRIVATE" method that we can access only through our GETTERS & SETTERS
         */

        System.out.println(employee1.getName2());
        // Here we're using our object to access our Instance Variable & Methods

        //Note: we use our object "CHAINED" with a " . " to access our Instance Variable & Methods

        // Result will display the Value: "HENRY" like from original class


        // -----------------------------------------------------------

        // USING SETTERS -> write and change the value from our Original class

        employee1.setName2("HeNrY");
        // Here we're using the same object we created above but, we're changing its value


        System.out.println(employee1.getName2());
        //Here our end result after changing our value: "HeNrY" from line 39

        System.out.println("-------------------------------------------------------------------");

        // how to access Public Instance Variables & Methods

        EncapsulationReview employee2 = new EncapsulationReview();
        System.out.println(employee2.name + " \"<- Public Instance Variable ->  Accessed through object\""); // Accessed through object


        System.out.println(employee2.salary + " \"<- Public Instance Variable ->  Accessed through object\"" ); // Accessed through object


        System.out.println("-----Changing the value of a Public Instance variable-----");

        employee2.name = "Mark";

        System.out.println("employee2.name = " + employee2.name);
        
        employee2.salary = 15_000;

        System.out.println("employee2.salary = " + employee2.salary);


        









    }
}
