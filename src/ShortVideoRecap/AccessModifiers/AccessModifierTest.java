package ShortVideoRecap.AccessModifiers;

public class AccessModifierTest {


    public static void main(String[] args) {

        // static int n2 = 200;
        /*
        This VARIABLE set as DEFAULT Access modifier
        also set AS STATIC -> which means that we CANNOT create an object of this
        VARIABLE, Instead we use the CLASS name to Access this VARIABLE

        Default -> ONLY Accessible in the same CLASS & PACKAGE
         */

        System.out.println(AccessModifiersInJava.n2);


        // public static int n3 = 300;
        /*
        Is a Int VARIABLE
        ACCESS Modifier is set -> Public: Visible Throughout the whole Project
        VARIABLE is Set -> STATIC: This is to avoid to create an object
        Instead we can ACCESS through the CLASS name to Access the VARIABLE

         */

        System.out.println(AccessModifiersInJava.n3);




        //METHODS


        /* static void method2(){
           System.out.println("Method with Default Access Modifier"); // Default
           }
           */
        AccessModifiersInJava.method2();


    }

}
