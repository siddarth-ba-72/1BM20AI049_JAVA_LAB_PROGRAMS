package LcmPackage;

public class Lcm {
    int a;
    int b;

    public Lcm(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calcLcm(int a, int b) {
        int l;
        int x = (a > b) ? a : b;
        for(l = x; l < (a*b); l = l + x)
            if((l % a == 0) && (l % b == 0))
                break;
        return l;
    }
}
