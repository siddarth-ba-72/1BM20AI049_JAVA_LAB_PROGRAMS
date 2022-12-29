/* Question:-
Write a program to find the number of vowels, consonents, digits and white space characters in a string
 */

import java.util.Scanner;

public class programming_exercise_8 {

    public static int countVowels(String str) {
        int numOfVowels = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                numOfVowels++;
            }
        }
        return numOfVowels;
    }

    public static int countConsonants(String str) {
        int consonants = 0;
        int numOfVowels = countVowels(str);
        int n = str.length();
        consonants = n - numOfVowels;
        return consonants;
    }

    public static int countWhiteSpaces(String str) {
        int whiteSpace = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                whiteSpace++;
        }
        return whiteSpace;
    }

    public static int countDigits(String str) {
        int digits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                digits++;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.println("Number of Vowels: " + countVowels(str));
        System.out.println("Number of Consonants: " + countConsonants(str));
        System.out.println("Number of Digits: " + countDigits(str));
        System.out.println("Number of White Spaces: " + countWhiteSpaces(str));
        sc.close();
    }
}
