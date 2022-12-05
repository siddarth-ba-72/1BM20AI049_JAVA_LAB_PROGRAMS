class Car {
   int model;
   String make;
   int speed;
   
   Car(int model, String make, int speed) {
      this.model = model;
      this.make = make;
      this.speed = speed;
   }
   
   public static void displayCar() {
      System.out.println("Car: " + make + ", Model no: " + model, ", Speed: " + speed);
   }
   
   public static void accelerate() {
      speed += 5;
      System.out.println("Speed: " + speed);
   }
   
   public static void brake() {
      speed -= 5;
      System.out.println("Speed: " + speed);
   }
}