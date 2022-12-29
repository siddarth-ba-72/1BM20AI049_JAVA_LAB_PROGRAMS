/* Question:-
Write a Java program that reverses all the words in a string that have odd lengths
*/

import java.util.Scanner;

public class programming_exercise_10 {

    public static String reverseWordsWithOddLengths(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String[] words = str.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 != 0) {
                words[i] = reverseWordsWithOddLengths(words[i]);
            }
        }
        String resString = String.join(" ", words);
        System.out.println(resString);
        sc.close();
    }
}
