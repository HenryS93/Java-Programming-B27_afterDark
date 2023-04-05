package Pratice;

import java.util.*;

public class Day1Practice {


    public static void main(String[] args) {


        //  result = m

        //FIRST SOLUTION
//        List<String> strings = Arrays.asList(a.split(""));
//        System.out.println(strings);
//
//        Set<String> noDup = new LinkedHashSet<>(strings);
//        System.out.println(noDup);

        // SECOND SOLUTION


        //Even or Odd

    int num = 100;


    if (num % 2 == 0){
        System.out.println(num + " is even");
    } else if (num % 2== 1){
        System.out.println(num + " is odd");
    }

        System.out.println("----------------------------Find Prime of given number------------------------------------");

    // Find Prime
// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        System.out.println(" 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97");


        int num1 = 17;
        boolean b = false;

        for (int i = 2; i <= num1 / 2; ++i) {

            // condition for nonprime number

            if (num1 % i == 0) {
                b = true;
                break;
            }
        }

        if (!b)
            System.out.println(num1 + " is a prime number.");
        else
            System.out.println(num1 + " is not a prime number.");


        System.out.println("------------------------------find all prime numbers from to num3 ENDs--------------------------------");



   // Adding arrays

        String[] anastasiya = {"happy", "go", "lucky"};
        String[] henry = {"handsome", "king", "tacos"};

        List<String> list = new ArrayList<>();
        list.addAll(List.of(anastasiya));
        list.addAll(List.of(henry));
        System.out.println(list);





    }

}
