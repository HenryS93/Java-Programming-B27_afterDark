package day24_array;

import java.util.Arrays;

public class ReverseArray {
    /*

    Reverse Array

	Write a program that will reverse the order of any given array
		Ex:
		Input:
			[1, 2, 3, 4, 5]
		Output:
			[5, 4, 3, 2, 1]
     */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] reverse = new int[arr.length];

        for(int i = arr.length - 1, y = 0; i >= 0; i--, y++){ // i goes backwards
            reverse[y] = arr[i];
        }

        // use i variable that is going backwards to read from the original array - index for arr array
        // use y variable that is going forwards to store into the reverse array - index for reverse array

        System.out.println(Arrays.toString(reverse));



        //Reverse a String + Palindrome

        String name = "racecar";
        String reversed = "";

        for (int i = name.length()-1; i >= 0 ; i-- ){

            reversed += name.charAt(i);
        }

        System.out.println(reversed);

//        if (name.equals(reversed)){
//            System.out.println("Palindrome");
//        }else {
//            System.out.println("Not palindrome");
//        }



        //Prime numbers

        int num = 100;
        // 2,3,4,5,6
        boolean isPrime = true;


        for (int i = 2; i < num; i++) {

            if (num % i == 0 ) {
                isPrime = false;
            }



            }
        System.out.println(isPrime?  num+" is Prime" : num+" is Not Prime");
        }

    }



