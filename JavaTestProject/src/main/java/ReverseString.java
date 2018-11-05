import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        String words,reverseWords ="";

        System.out.println("Enter String to Reverse");
        words = keyboard.nextLine();

        System.out.println("Input String is:   "+words);

        char[] characters= words.toCharArray();




        for(int wordsLength = words.length()-1;wordsLength>=0;wordsLength--){
         //   System.out.println("\n value in array: "+charBuffer[strLength]);
            reverseWords=reverseWords+characters[wordsLength];
         //   System.out.println("Value in reverse array: "+reverseBuffer);
        }

       System.out.println("Reverse string is:"+ reverseWords);
    }


}
