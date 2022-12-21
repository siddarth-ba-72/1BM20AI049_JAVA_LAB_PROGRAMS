package Calculator;

public class Operations {
    int n1;
    int n2;

    public Operations(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void sum() {
        System.out.println("Sum of " + n1 + " and " + n2 + " = " + (n1 + n2));
    }

    public void difference() {
        System.out.println("Differnece of " + n1 + " and " + n2 + " = " + (n1 - n2));
    }

    public void multiply() {
        System.out.println("Multiplication of " + n1 + " and " + n2 + " = " + (n1 * n2));
    }

    public void divide() {
        System.out.println("Division of " + n1 + " by " + n2 + " = " + (float) (n1 / n2));
    }
}