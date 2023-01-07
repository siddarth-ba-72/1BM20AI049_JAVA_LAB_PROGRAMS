package cie_1_lab_cycle_practice_programs;

import java.util.Scanner;

/*Question:-
Develop a program to do the following task on matrices. The Matrix class has methods
for each of the following:
i. get the number of rows
ii. get the number of columns
iii. set the elements of the matrix at given position (i, j)
iv. adding two matrices. If the matrices are not addable, &quot;Matrices cannot be added&quot;
will be displayed.
v. main method for creating objects of matrices class and invoke the methods.
*/

class Matrix {
    private int rows;
    private int cols;
    int[][] mat;

    Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        mat = new int[rows][cols];
    }

    int getRows() {
        return this.rows;
    }

    int getCols() {
        return this.cols;
    }

    void setElement(Matrix m, int i, int j, int k) {
        if (i < rows && j < cols)
            m.mat[i][j] = k;
    }

    void addMatrices(Matrix m) {
        int r1 = this.rows;
        int c1 = this.cols;
        int r2 = m.rows;
        int c2 = m.cols;

        if (r1 != r2 && c1 != c2) {
            System.out.println("The matrices cannot be added");
            return;
        }

        System.out.println("\nAdded Matrix:-");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++)
                System.out.print((this.mat[i][j] + m.mat[i][j]) + " ");
            System.out.println();
        }
    }

    void displayMatrix() {
        System.out.println("\nMatrix:-");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print(this.mat[i][j] + " ");
            }
            System.out.println();
        }
    }

}

public class _1a_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter rows (matrix 1): ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns (matrix 1): ");
        int c1 = sc.nextInt();

        Matrix m1 = new Matrix(r1, c1);
        System.out.println("Enter Matrix elements:-");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++) {
                System.out.print("matrix[" + (i + 1) + "][" + (j + 1) + "]: ");
                m1.mat[i][j] = sc.nextInt();
            }
        m1.displayMatrix();

        System.out.print("\nEnter rows (matrix 2): ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns (matrix 2): ");
        int c2 = sc.nextInt();
        Matrix m2 = new Matrix(r2, c2);
        System.out.println("Enter Matrix elements:-");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++) {
                System.out.print("matrix[" + (i + 1) + "][" + (j + 1) + "]: ");
                m2.mat[i][j] = sc.nextInt();
            }
        m2.displayMatrix();

        m1.addMatrices(m2);

        sc.close();
    }
}
