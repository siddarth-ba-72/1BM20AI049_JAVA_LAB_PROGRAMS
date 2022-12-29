/* Question:-
Write an interactive program that reads a statement from user input and:
- prints how many words it has.
- Converts it to uppercase and print the output.
 */

import java.util.Scanner;

public class programming_exercise_7 {

    public static int countWords(String str) {
        return str.split(" ").length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.nextLine();
        int numOfWords = countWords(str);
        System.out.print("Number of words: " + numOfWords);
        System.out.println("\nUpper case: " + str.toUpperCase());
        sc.close();
    }
}