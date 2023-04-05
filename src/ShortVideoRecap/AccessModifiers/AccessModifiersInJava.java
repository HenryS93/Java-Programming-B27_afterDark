package ShortVideoRecap.AccessModifiers;

public class AccessModifiersInJava {


    /*
      VARIABLES
     */
    private static int n1 = 100; // Private Access Modifier

    static int n2 = 200; // Default Access Modifier

    public static int n3 = 300;  // Public Access Modifier



    /*
    METHODS
     */
    private static void method1(){
        System.out.println("Method with Private Access Modifier"); //Private
    }

    static void method2(){
        System.out.println("Method with Default Access Modifier"); // Default
    }


    public static void method3(){
        System.out.println("Method with public Access Modifier"); // Public
    }


    public static void main(String[] args) {


        /**
         * There's a total of 4 Access modifiers
         *
         * Private -> (Less Visible) when an Access modifier is private it means that it's only available within the same class. (CLASS)
         * Default -> its available within the same package (CLASS / PACKAGE)
         * Protected -> is accessible in the same Class & Package ONLY if it's Inherited through a SUBCLASS (CLASS / PACKAGE / SUBCLASS)
         * Public (Most Visible) -> it can be accessed throughout the whole project (CLASS / PACKAGE / SUBCLASS / WORLD)
         *
         *
         * CLASSES -> CAN ONLY HAVE 2 DIFFERENT ACCESS MODIFIERS: (PUBLIC AND DEFAULT)
         *
         * VARIABLES / CONSTRUCTORS / METHODS / -> CAN HAVE ANY OF THE 4 ACCESS MODIFIERS
         */




















    }
}
