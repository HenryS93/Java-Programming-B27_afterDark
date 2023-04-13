package ShortVideoRecap.exceptionRecap;

public class ThrowsKeyword {


    public static void main (String [] args){


//        System.out.println("Option A:");
//        // Option A: We can use this option to HANDLE this exception
//
//        System.out.println("Hello");
//
//        try {
//            Thread.sleep(3000);
//
//        }catch (InterruptedException e){
//            e.getMessage();
//        }

        System.out.println("System.out.println(\"Option A:\");\n" +
                "        // Option A: We can use this option to HANDLE this exception\n" +
                "        \n" +
                "        System.out.println(\"Hello\");\n" +
                "        \n" +
                "        try {\n" +
                "            Thread.sleep(3000);\n" +
                "\n" +
                "        }catch (InterruptedException e){\n" +
                "            e.getMessage();\n" +
                "        }");



        System.out.println("world \n");


        System.out.println("OR\n");



        System.out.println("// option B: is to use the Throws keyword with our method signature, to handle method exceptions during compile time.\n"+
                "//Method signature: \"public static void main (String [] args){\" -> then we add \"throws\" keyword which is faster and to handle multiple exceptions");

        // option B: is to use the Throws keyword with our method signature, to handle method exceptions.
        //Method signature: "public static void main (String [] args){" -> then we add "throws" keyword to handle multiple exceptions


        System.out.println("public static void main (String [] args)" + "throws InterruptionException{");
        System.out.println("This is used to handle multiple checked exception at once plus is the fastest way instead of using try & catch blocks for every exception we may face");
//"This is used to handle multiple checked exception at once plus is the fastest way instead of using try & catch blocks for every exception we may face"


    }



}
