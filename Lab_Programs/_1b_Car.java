/* Question:
1b.Write a class named Car that has the following data members:
• model. The model field is an int that holds the car’s year.
• make. The make field references a String object that holds the make of the car.
• speed. The speed field is an int that holds the car’s current speed.
The class should have the following constructor and other methods.
• The constructor should accept the car’s year model, make and speed as arguments.
• Accessor methods should get the values stored in an object’s year, Model, make, and speed fields.
• Accelerate method should add 5 to the speed field each time it is called.
• Brake method should subtract 5 from the speed field each time it is called.
Demonstrate the class in a program that creates a Car object, and then calls the accelerate method five times. After each call to the accelerate method, get the current speed of the car and display it. Call the brake method five times. After each call to the brake method, get the current speed of the car and display it.
 */

// Car class
class Car {
   private int model;
   private String make;
   private int speed;

   Car(int model, String make, int speed) {
      this.model = model;
      this.make = make;
      this.speed = speed;
   }

   // Getters for car data members

   public int getModel() {
      return this.model;
   }

   public String getMake() {
      return this.make;
   }

   public int getSpeed() {
      return this.speed;
   }

   // Setter for accelerating speed
   void accelerate() {
      this.speed += 5;
      System.out.println("Accelerating --> Speed: " + speed);
   }

   // Setter for decelerating speed
   void brake() {
      this.speed -= 5;
      System.out.println("Decelerating --> Speed: " + speed);
   }
}

public class _1b_Car {
   public static void main(String[] args) {
      Car car = new Car(2020, "i20 Sportz", 72);
      System.out.println("Car: " + car.getMake() + ", Model: " + car.getModel() + ", Initial Speed: " + car.getSpeed());
      System.out.println();

      for (int i = 1; i <= 5; i++)
         car.accelerate();
      System.out.println();

      for (int i = 1; i <= 5; i++)
         car.brake();
      System.out.println();
   }
}