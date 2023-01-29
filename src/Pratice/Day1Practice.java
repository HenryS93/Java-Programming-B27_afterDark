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


    // Find Prime

       int num2 = 100;

   for (int i = 2; i < num2;i++){

       if (num2 % i == 1){
           System.out.println(i+" prime");
       } else if (num2 % i == 0 ) {
           System.out.println(i +" not prime");
       }


   }

   // Adding arrays

        String[] anastasiya = {"happy", "go", "lucky"};
        String[] henry = {"handsome", "king", "tacos"};

        List<String> list = new ArrayList<>();
        list.addAll(List.of(anastasiya));
        list.addAll(List.of(henry));
        System.out.println(list);





    }

}
