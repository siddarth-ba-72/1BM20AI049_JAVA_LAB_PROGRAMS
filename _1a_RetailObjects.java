// design and create a class named RetailItem that holds data about an item in a retail store. The class should have following fields:
// 1. Description - description field references a string obj that holdfs a brief desc of the item.
// 2. Units - the units field is an int var that holds the no of units of item currently available in inventory
// 3. Price field - holds the items retail price.
// Write a constructor that accepts an arg for each field, appropriate methods that stores vals in these fields and accessor methods that return vals in these fields.
// write the main method which creates 3 retail item objects and and invokes appropriate methods

class RetailItem {
   private String desc;
   private int units;
   private int price;
   
   RetailItem(String desc, int units, int price) {
      this.desc = desc;
      this.units = units;
      this.price = price;
   }
   
   public void updateUnits(int u) {
      this.units = u;
   }
   
   public void updatePrice(int p) {
      this.price = p;
   }
   
   public String getDesc() {
      return this.desc;
   }
   
   public int getUnits() {
      return this.units;
   }
   
   public int getPrice() {
      return this.price;
   }
}

public class RetailObjects {
   public static void main(String[] args) {
      RetailItem r1 = new RetailItem("Surfexcel", 100, 20);
      RetailItem r2 = new RetailItem("Mobile", 250, 20000);
      
      System.out.println("Item: " + r1.getDesc() + ", No of units: " + r1.getUnits() + ", Price: " + r1.getPrice());
      r1.updateUnits(500);
      r1.updatePrice(50);
      System.out.println("Item: " + r1.getDesc() + ", No of units: " + r1.getUnits() + ", Price: " + r1.getPrice());
      
      System.out.println("Item: " + r2.getDesc() + ", No of units: " + r2.getUnits() + ", Price: " + r2.getPrice());
      r2.updateUnits(500);
      r2.updatePrice(50);
      System.out.println("Item: " + r2.getDesc() + ", No of units: " + r2.getUnits() + ", Price: " + r2.getPrice());

   }
}