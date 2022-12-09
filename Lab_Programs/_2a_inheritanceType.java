/* Question:
2a. Identify the type of inheritance in the given diagram. Create a class A with two integer member
variables that are private, two float variables that are protected and two integer variables that are public.
Let class B inherit class A and class C and Class D are inherited from class B. Write appropriate
methods to illustrate the following
i) Usage of super keyword
ii) Function overriding
iii) Default constructors
iv) Parameterized constructors
v) How to we make a method not to be over ridden and a class not be inherited further
 */

// A class with all data members
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

// B class inherited from A
// Displays Protected members of A
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

// C class inherited from B
// Displays Public members of A
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

// D class inherited from B
// Displays Private members of A
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