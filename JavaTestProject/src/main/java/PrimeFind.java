
/*
Problem Statement: Get user input in 'uerNum', and output whether it is prime or not

*/

import java.util.Scanner;

public class PrimeFind {
    public static void main(String args[]){

        int i;
        boolean isPrime =true;


        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter number you want to test for Prime Number:\n");
        int usrNum = keyboard.nextInt();



        i=2;
          while(i<= (usrNum/2) && isPrime != false ) {
              if (usrNum % i == 0) isPrime = false;
              i++;
          }

        if(isPrime == false)
            System.out.println("Not Prime Number:" + usrNum);
        else
            System.out.println("Prime Number:" + usrNum);


    }
}
