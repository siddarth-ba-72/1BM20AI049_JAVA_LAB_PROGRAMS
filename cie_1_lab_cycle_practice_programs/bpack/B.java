package cie_1_lab_cycle_practice_programs.bpack;

import cie_1_lab_cycle_practice_programs.apack.A;

public class B extends A {

    public B(int var1, int var2, int var3, int var4) {
        super(var1, var2, var3, var4);
    }

    public void display() {
        System.out.println("Default variable: " + getVar1());
        System.out.println("Protected variable: " + var2);
        System.out.println("Private variable: " + getVar3());
        System.out.println("Public variable: " + var4);
    }
}
