package cie_1_lab_cycle_practice_programs;

/* Question:-
Write a Java program to perform employee payroll processing using packages.
In the java file, Emp.java creates a package employee and creates a class Emp.
Declare the variables name,empid, category, bpay, hra, da, npay, pf, grosspay,
incometax, and allowance. Calculate the values in methods. Create another java
file Emppay.java. Create an object e to call the methods to perform and print
values.
*/

import cie_1_lab_cycle_practice_programs.Employee.Emp;

public class _4_emp_pay {
    public static void main(String[] args) {
        Emp e = new Emp("Scofield", "23", "Male", 120000);
        e.calculate();
        e.display();
    }
}
