class A {
    private int p;
    private int q;
    protected float u;
    protected float v;
    public int x;
    public int y;

    public int getP() {
        return this.p;
    }

    public int getQ() {
        return this.q;
    }

    public void getMembers() {
        System.out.println("Public members: " + x + ", " + y);
    }

    public A(int p, int q, float u, float v, int x, int y) {
        this.p = p;
        this.q = q;
        this.u = u;
        this.v = v;
        this.x = x;
        this.y = y;
    }

    public A() {
        System.out.println("This is Class A Constructor");
    }
}

class B extends A {
    public void getMembers() {
        System.out.println("Protected members: " + u + ", " + v);
        super.getMembers();
    }

    public B(int p, int q, float u, float v, int x, int y) {
        super(p, q, u, v, x, y);
    }

    public B() {
        System.out.println("This is Class B Constructor");
    }
}

class C extends B {
    public void getMembers() {
        System.out.println("Public members: " + x + ", " + y);
    }

    public C(int p, int q, float u, float v, int x, int y) {
        super(p, q, u, v, x, y);
    }

    public C() {
        System.out.println("This is Class C Constructor");
    }
}

class D extends B {
    public void getMembers() {
        System.out.println("Private members: " + getP() + ", " + getQ());
        super.getMembers();
    }

    public void getMsg() {
        System.out.println("Calling class D");
    }

    public D(int p, int q, float u, float v, int x, int y) {
        super(p, q, u, v, x, y);
    }

    public D() {
        System.out.println("This is Class D Constructor");
    }
}

public class _2a_inheritanceType {
    public static void main(String[] args) {

        // Default constructor
        System.out.println("----- Default constructor -----");
        D dClass1 = new D();
        dClass1.getMsg();
        System.out.println();

        // Parameterized constructor
        System.out.println("----- Parameterized constructor -----");
        D dClass = new D(1, 2, 3.3f, 4.4f, 5, 6);
        dClass.getMembers();
    }
}