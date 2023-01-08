package cie_1_lab_cycle_practice_programs;

/*Question:-
Write a class named Car that has the following data members:
• model. The model field is an int that holds the car’s year.
• make. The make field references a String object that holds the make of
the car.
• speed. The speed field is an int that holds the car’s current speed.
The class should have the following constructor and other methods.
• The constructor should accept the car’s year model, make and speed as
arguments.
• Accessor methods should get the values stored in an object’s year,
Model, make, and speed fields.
• Accelerate method should add 5 to the speed field each time it is called.
• Brake method should subtract 5 from the speed field each time it is
called.
Demonstrate the class in a program that creates a Car object, and then calls the
accelerate method five times. After each call to the accelerate method, get the
current speed of the car and display it. Call the brake method five times. After
each call to the brake method, get the current speed of the car and display it.
*/

class Car {
    private int model;
    private String make;
    private int speed;

    Car(int model, String make, int speed) {
        this.model = model;
        this.make = make;
        this.speed = speed;
    }

    int getModel() {
        return this.model;
    }

    String getMake() {
        return this.make;
    }

    int getSpeed() {
        return this.speed;
    }

    void accelerate(int time) {
        for (int t = 1; t <= time; t++) {
            this.speed += 5;
            System.out.println("Car accelerating --> " + this.speed + " kmp/h");
        }
    }

    void brake(int time) {
        for (int t = 1; t <= time; t++) {
            this.speed -= 5;
            System.out.println("Car decelerating --> " + this.speed + " kmp/h");
        }
    }
}

public class _3b_car {
    public static void main(String[] args) {
        Car car = new Car(2022, "Hyundai", 72);
        System.out.println("Model (year): " + car.getModel());
        System.out.println("Make: " + car.getMake());
        System.out.println("Initial Speed: " + car.getSpeed() + " km/h");

        System.out.println();
        car.accelerate(5);
        System.out.println();
        car.brake(5);
    }
}
