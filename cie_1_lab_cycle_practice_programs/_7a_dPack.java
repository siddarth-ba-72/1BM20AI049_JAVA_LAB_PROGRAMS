package cie_1_lab_cycle_practice_programs;

/*Question:-
Define one class A in package apack. In class A, four variables are defined of
access modifiers default, protected, private and public. Define class B in package
bpack which extends A and write display() method which access variables of
class A. Define class C in package cpack which has one method display() in that
create one object of class A and display its variables. Define class Protected Demo
in package dpack which contains the main () method. Create objects of class B
and C and call display method for both these objects. Analyze the program by
interpreting the access modifiers and provide valid conclusion.
 */

import cie_1_lab_cycle_practice_programs.bpack.B;
import cie_1_lab_cycle_practice_programs.cpack.C;

public class _7a_dPack {
    public static void main(String[] args) {
        System.out.println("\nClass B:");
        B bObj = new B(10, 20, 30, 40);
        bObj.display();

        System.out.println("\nClass C:");
        C cObj = new C();
        cObj.display();
    }
}
