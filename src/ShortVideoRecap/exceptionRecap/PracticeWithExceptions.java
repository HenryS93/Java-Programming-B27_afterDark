package ShortVideoRecap.exceptionRecap;

import java.io.FileInputStream;

public class PracticeWithExceptions {

    public static void main(String []  args){



        Integer [] arr = {10,20,30};


        //System.out.println(arr[20]);   //-> This is a (UNCHECKED EXCEPTION): WHY? -> because its NOT checked during compile time.

        /* LINE: 12
        Results
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 3
	    at ShortVideoRecap.exceptionRecap.PracticeWithExceptions.main(PracticeWithExceptions.java:12)
         */


       // System.out.println("Java".charAt(-1)); //(UNCHECKED EXCEPTION)This also will give us an ERROR: Since charAt() does NOT handle -1



        String str = null;
        //System.out.println(str.toLowerCase()); // This also Gives ERROR, Since its a (UNCHECKED EXCEPTION), it's checked after compile time.

        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println();
        System.out.println("---------CHECKED EXCEPTION---------");

        System.out.println("(CHECKED EXCEPTION) Happens during compile time, means that code gets checked before running");


        //Thread.sleep(3000); // Means that it is UNHANDLED does NOT let us run our code until Exception is HANDLED.

        //FileInputStream file = new FileInputStream("file path");


        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("-----------Try & Catch blocks");


//        System.out.println(9/0); //if we try to print the results of 9 divided by 0 results in an Exception

        //Why? -> because 9 CANNOT be divided by 0, So in order to handle this exception we use try and catch block.


        try {

            System.out.println(9/0);

        }catch (ArithmeticException e){ //Exception type-> ArithmeticException we must specify, in order to handle this exception and assign it to variable "e"

           //e.printStackTrace(); // this method fully displays the message of the exception.
            System.out.println("message from : try block ");

            System.exit(0); // --> This line of code will prevent the Finally block from executing -LINE: 64 Since Finally blocks are always executed no matter what.

        } finally {
            System.out.println("Finally Block");
        }


        System.out.println("hello");














    }




}
