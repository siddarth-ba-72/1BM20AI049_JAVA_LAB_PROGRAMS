// Shape Class: Abstract
abstract class Shape {
    abstract void showArea();
}

// Triangle class
class Triangle extends Shape {
    double base;
    double height;
    double area;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void findArea() {
        area = 0.5 * base * height;
    }

    @Override
    void showArea() {
        System.out.println("Area of Traingle with base: " + base + " height: " + height + " = " + area);
    }
}

// Circle class
class Circle extends Shape {
    double radius;
    double area;

    Circle() {
        // Explicit constructor
    }

    Circle(double radius) {
        this.radius = radius;
    }

    void findArea() {
        area = 3.142 * radius * radius;
    }

    @Override
    void showArea() {
        System.out.println("Area of Circle with radius: " + radius + " = " + area);
    }
}

// Hexagon class
class Hexagon extends Shape {
    double sideLen;
    double area;

    Hexagon(double sideLen) {
        this.sideLen = sideLen;
    }

    void findArea() {
        area = ((3 * 1.73) / 2) * sideLen * sideLen;
    }

    @Override
    void showArea() {
        System.out.println("Area of Hexagon with side length: " + sideLen + " = " + area);
    }
}

// Sphere class
class Sphere extends Circle {

    Sphere(double radius) {
        this.radius = radius;
    }

    void findArea() {
        area = 4 * 3.14 * radius * radius;
    }

    void showArea() {
        System.out.println("Area of Sphere with radius: " + radius + " = " + area);
    }
}

public class _2b_AreaOfShapes {
    public static void main(String[] args) {

        Triangle tr = new Triangle(8.0, 6.0);
        tr.findArea();
        tr.showArea();

        Circle cr = new Circle(7.0);
        cr.findArea();
        cr.showArea();

        Hexagon hx = new Hexagon(5.0);
        hx.findArea();
        hx.showArea();

        Sphere sp = new Sphere(8.0);
        sp.findArea();
        sp.showArea();
    }
}
