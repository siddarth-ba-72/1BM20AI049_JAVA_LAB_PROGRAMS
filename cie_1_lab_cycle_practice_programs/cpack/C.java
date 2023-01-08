package cie_1_lab_cycle_practice_programs.cpack;

import cie_1_lab_cycle_practice_programs.apack.A;

public class C {
    A aObj = new A(10, 20, 40, 80);

    public void display() {
        System.out.println("Default variable: " + aObj.getVar1());
        System.out.println("Protected variable: " + aObj.getVar2());
        System.out.println("Private variable: " + aObj.getVar3());
        System.out.println("Public variable: " + aObj.var4);
    }
}
