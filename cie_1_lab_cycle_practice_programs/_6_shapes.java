package cie_1_lab_cycle_practice_programs;

/*Question:-
Your program will consist of the following classes: Shape, Circle, Square, Cube,
Sphere, Cylinder, and Glome and two interfaces Area and Volume. Your classes
may only have the class variable specified in the table below and the methods
defined in the two interfaces Area and Volume. You will implement the methods
specified in the Area and Volume interfaces and have them return the
appropriate value for each shape. Class Shape will have a single public method
called getName that returns a string.
Class Class Variable Constructor Extends Implements
Shape String name Shape()
Circle double radius Circle( double r, String n ) Shape Area
Square double side Square( double s, String n ) Shape Area
Cylinder double height Cylinder(double h, double r,
String n )
Circle Volume
Sphere None Sphere( double r, String n ) Circle Volume
Cube None Cube( double s, String n ) Square Volume
Glome None Glome( double r, String n ) Sphere Volume
 */

class Shape {
    String shapeName;

    String getName() {
        return this.shapeName;
    }
}

interface Area {
    public double getArea();
}

interface Volume {
    public double getVolume();
}

class Circle extends Shape implements Area {
    double radius;

    Circle() {
        // Implicit constructor
    }

    Circle(double radius, String shapename) {
        this.radius = radius;
        this.shapeName = shapename;
    }

    @Override
    public double getArea() {
        return (Math.PI * radius * radius);
    }
}

class Square extends Shape implements Area {
    double side;

    Square(double side, String shapename) {
        this.side = side;
        this.shapeName = shapename;
    }

    @Override
    public double getArea() {
        return (side * side);
    }
}

class Cylinder extends Circle implements Volume {
    double height;

    Cylinder(double radius, double height, String shapename) {
        this.radius = radius;
        this.height = height;
        this.shapeName = shapename;
    }

    @Override
    public double getVolume() {
        return ((Math.PI) * Math.pow(radius, 2) * height);
    }
}

class Sphere extends Circle implements Volume {

    Sphere(double radius, String shapename) {
        super(radius, shapename);
    }

    @Override
    public double getVolume() {
        return ((4 / 3) * Math.PI * (Math.pow(radius, 3)));
    }
}

class Cube extends Square implements Volume {
    Cube(double side, String shapename) {
        super(side, shapename);
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }
}

class Glome extends Sphere {

    Glome(double radius, String shapename) {
        super(radius, shapename);
    }

    public double getVolume() {
        return (2 * Math.pow(Math.PI, 2) * Math.pow(2 * radius, 3));
    }
}

public class _6_shapes {
    public static void main(String[] args) {
        Circle circle = new Circle(8.0, "Circle");
        System.out.println("Name of the shape: " + circle.getName());
        System.out.println("Area of " + circle.getName() + ": " + circle.getArea());
        System.out.println();

        Square square = new Square(9.0, "Square");
        System.out.println("Name of the shape: " + square.getName());
        System.out.println("Area of " + square.getName() + ": " + square.getArea());
        System.out.println();

        Cylinder cylinder = new Cylinder(10.0, 6.0, "Cylinder");
        System.out.println("Name of the shape: " + cylinder.getName());
        System.out.println("Volume of " + cylinder.getName() + ": " + cylinder.getVolume());
        System.out.println();

        Sphere sphere = new Sphere(4.0, "Sphere");
        System.out.println("Name of the shape: " + sphere.getName());
        System.out.println("Volume of " + sphere.getName() + ": " + sphere.getVolume());
        System.out.println();

        Cube cube = new Cube(7.0, "Cube");
        System.out.println("Name of the shape: " + cube.getName());
        System.out.println("Volume of " + cube.getName() + ": " + cube.getVolume());
        System.out.println();

        Glome glome = new Glome(7.0, "Glome");
        System.out.println("Name of the shape: " + glome.getName());
        System.out.println("Volume of " + glome.getName() + ": " + glome.getVolume());
        System.out.println();
    }
}
