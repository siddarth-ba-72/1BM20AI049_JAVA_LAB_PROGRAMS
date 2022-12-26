import Calculator.Operations;

public class simple {
    public static void main(String[] args) {
        Operations op = new Operations(5, 6);
        op.sum();
        op.difference();
        op.multiply();
        op.divide();
    }
}
