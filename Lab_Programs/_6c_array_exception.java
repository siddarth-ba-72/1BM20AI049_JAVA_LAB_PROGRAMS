/* Question:-
write a java pgm to input n integer values and store them in an array. If the user wants to print an element of the array given an index, if the index givrn by the user is greater then the array length generate ArrayOutOfBoundException and print valid message in the catch block
*/

import java.util.Scanner;


public class _6c_array_exception {

    public static void printArrayElements(int[] arr, int n) {
        try {
            System.out.print("Array elements are: ");
            for(int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("\nError: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array: ");
        int k = sc.nextInt();
        int[] arr = new int[k];
        System.out.print("Enter Array elements: ");
        for(int i = 0; i < k; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter n (greater than the length of array): ");
        int n = sc.nextInt();
        printArrayElements(arr, n);
        sc.close();
    }
}
