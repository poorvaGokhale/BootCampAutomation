/*
 * Problem Statement: Find Prime number at nth Position e.g. 5th position prime numbers is 7. List of prime numbers (1,2,3,5,7)
 * Take input of nth position in variable 'pos'
 *
 *
 * */

import java.util.Scanner;

public class FindNthPrime {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);
        int position, numberCounter, numberUnderTest;

        System.out.println("Enter place of Prime number you wish to find");
        position = keyboard.nextInt();


        for (numberCounter = 1, numberUnderTest = 1; numberCounter <= position; numberUnderTest++) {

            if (isPrimeTest(numberUnderTest)) {
                System.out.println("Prime Number at position " + numberCounter + " is::" + numberUnderTest);
                numberCounter++;  //this increases only if number is prime; used for checking position has reached or not.
            }
        }
    }


    private static boolean isPrimeTest(int number) {
        boolean isPrime = true;
        if (number == 1) return true;
        for (int j = 2; j <= (number / 2) && isPrime; j++) {

            if (number % j == 0) isPrime = false;
        }

        return isPrime;
    }

}