/*
Explore Strings DtataType and inbuilt functions
 */

import java.util.Scanner;


public class StringsDataTypeTry {
    public static void main(String args[]){
        // get string as input
        Scanner keyboard =new Scanner(System.in);
        System.out.println("Enter String:");
        String stringVar = keyboard.nextLine();

        // Print Input String
        System.out.println("Inout String is:" + stringVar);

        // convert string to lower case
        System.out.println("Lowercase conversion is:" + stringVar.toLowerCase());

        // Convert String to Uppercase
        System.out.println("Uppercase conversion String is:" + stringVar.toUpperCase());

        // trim String
        System.out.println("Trimmed String is:"+ stringVar.trim());

        // Find String Length
        System.out.println("String Length is:" + stringVar.length());

/// Line to words parsing


        String[] stringBuffer = stringVar.trim().split("\\s+");
        System.out.println("\n String Split length:" + stringBuffer.length);

        System.out.println("\tWords split are:");
        for(int i = 0; i < stringBuffer.length; i++) System.out.println("\t" + stringBuffer[i]);

        // Convert String to Char array; then use Char array to find ascii value; need local char array defined to store converted char array
        int asciiVal=0;
        char[] charBuffer = stringVar.toCharArray();

        for(int i=0; i<stringVar.length();i++) {
          //  System.out.println("Char:"+ charBuffer[i]);
            asciiVal += (int) charBuffer[i];
        }
        System.out.println("Ascii of String is: " + asciiVal );


    }
}
