package ShortVideoRecap.testOOP;

import ShortVideoRecap.AccessModifiers.AccessModifiersInJava;

public class TestingAccessModifiers2 {
    public static void main(String[] args) {

        //VARIABLE
        //AccessModifiersInJava.n1 -> NOT working because n1 VARIABLE is private (Works in same CLASS ONLY)
        //AccessModifiersInJava.n2 -> NOT working because n2 is set to Default (Works in same CLASS & Package ONLY)

        System.out.println(AccessModifiersInJava.n3); // Works Because VARIABLE is SET to public


        //METHOD
        //AccessModifiersInJava.method1(); -> NOT Working METHOD is SET to Private (Works in same CLASS ONLY)
        //AccessModifiersInJava.method2();-> NOT Working METHOD is SET to DEFAULT (Works in same CLASS & PACKAGE ONLY)

        AccessModifiersInJava.method3(); //This METHOD is Public works just fine





    }



}
