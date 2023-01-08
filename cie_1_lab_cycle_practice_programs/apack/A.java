package cie_1_lab_cycle_practice_programs.apack;

public class A {
    int var1;
    protected int var2;
    private int var3;
    public int var4;

    public A(int var1, int var2, int var3, int var4) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
    }

    public int getVar1() {
        return var1;
    }

    public int getVar2() {
        return var2;
    }

    public int getVar3() {
        return this.var3;
    }
}
