package GcdPackage;

public class Gcd {
    int a;
    int b;

    public Gcd(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calcGcd(int a, int b) {
        while(a != b) {
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        return b;
    }
}
