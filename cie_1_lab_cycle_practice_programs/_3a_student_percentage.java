package cie_1_lab_cycle_practice_programs;

/*Question:-
We have to calculate the percentage of marks obtained in three subjects (each
out of 100) by student A and in four subjects (each out of 100) by student B.
Create an abstract class &#39;Marks&#39; with an abstract method &#39;getPercentage&#39;. It is
inherited by two other classes &#39;A&#39; and &#39;B&#39; each having a method with the same
name which returns the percentage of the students. The constructor of student A
takes the marks in three subjects as its parameters and the marks in four
subjects as its parameters for student B. Create an object for each of the two
classes and print the percentage of marks for both the students.
 */

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {

    double ma_1;
    double ma_2;
    double ma_3;

    A(double ma_1, double ma_2, double ma_3) {
        this.ma_1 = ma_1;
        this.ma_2 = ma_2;
        this.ma_3 = ma_3;
    }

    double getPercentage() {
        return ((ma_1 + ma_2 + ma_3)) / 3;
    }
}

class B extends Marks {
    double mb_1;
    double mb_2;
    double mb_3;
    double mb_4;

    B(double mb_1, double mb_2, double mb_3, double mb_4) {
        this.mb_1 = mb_1;
        this.mb_2 = mb_2;
        this.mb_3 = mb_3;
        this.mb_4 = mb_4;
    }

    double getPercentage() {
        return ((mb_1 + mb_2 + mb_3 + mb_4)) / 4;
    }
}

public class _3a_student_percentage {
    public static void main(String[] args) {

        A a = new A(59, 86, 91);
        System.out.println("Percentage of Student A: " + a.getPercentage());

        B b = new B(82, 56, 95, 75);
        System.out.println("Percentage of Student B: " + b.getPercentage());
    }
}
