/*
Take Strings as a input and find palindrome
*/

import java.awt.*;
import java.util.Scanner;

public class FindPalindrome {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter String:\n");
        String palindromeInput = keyboard.nextLine();
        System.out.println("Words Under Check are:");
        String[] palindromeWords = palindromeInput.trim().split("\\s+");

       for (int wordCounterStart = 0; wordCounterStart < palindromeWords.length; wordCounterStart++) {
            System.out.println(palindromeWords[wordCounterStart]);

            for (int position = wordCounterStart + 1; position < palindromeWords.length; position++) {
             //   System.out.println("\t String under Compare:" + palindromeWords[position] + "\t value of position:" + position);
                int value = palindromeWords[position].compareToIgnoreCase(palindromeWords[wordCounterStart]);
               // System.out.println("\tCompareValue:" + value);
                if (value == 0) System.out.println("\t\tDuplicate Strings:" +wordCounterStart+" &&" +position+"\t"+ palindromeWords[position]);
            }
        }

    }
}
