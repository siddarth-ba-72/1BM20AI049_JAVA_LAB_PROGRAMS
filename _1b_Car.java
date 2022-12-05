class Car {
   int model;
   String make;
   int speed;
   
   Car(int model, String make, int speed) {
      this.model = model;
      this.make = make;
      this.speed = speed;
   }
   
   void displayCar() {
      System.out.println("Car: " + make + ", Model: " + model + ", Initial Speed: " + speed);
   }
   
   void accelerate() {
      speed += 5;
      System.out.println("Accelerating --> Speed: " + speed);
   }
   
   void brake() {
      speed -= 5;
      System.out.println("Braking --> Speed: " + speed);
   }
}

public class _1b_Car {
   public static void main(String[] args) {
      Car c = new Car(20, "i20 Sportz", 72);
      c.displayCar();
      System.out.println();

      c.accelerate();
      c.accelerate();
      c.accelerate();
      c.accelerate();
      c.accelerate();
      System.out.println();
      
      c.brake();
      c.brake();
      c.brake();
      c.brake();
      c.brake();
      System.out.println();
   }
}