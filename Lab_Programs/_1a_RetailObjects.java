/*
1a. Design and create a class named Retail Item that holds data about an item in a retail store. The class should have the following fields:
• Description - The description field references a String object that holds a brief description of the item.
• Units - The units field is an int variable that holds the number of units currently in inventory.
• Price - The price field is a double that holds the item’s retail price.
Write a constructor that accepts arguments for each field, appropriate mutator methods that store values in these fields, and accessor methods that return the values in these fields. Write the main method which creates three Retail Item objects and invokes appropriate methods.
 */

// Retail Items Class
class RetailItem {
   private String desc;
   private int units;
   private int price;

   RetailItem(String desc, int units, int price) {
      this.desc = desc;
      this.units = units;
      this.price = price;
   }

   // Setters for private data members

   public void updateUnits(int u) {
      this.units = u;
   }

   public void updatePrice(int p) {
      this.price = p;
   }

   // Getters for private data members

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

public class _1a_RetailObjects {
   public static void main(String[] args) {
      RetailItem r1 = new RetailItem("Book", 100, 200);
      RetailItem r2 = new RetailItem("Mobile", 20, 15000);

      System.out.println("Item: " + r1.getDesc() + ", No of units: " + r1.getUnits() + ", Price: " + r1.getPrice());
      System.out.println("Updating No of units and price of " + r1.getDesc());
      r1.updateUnits(500);
      r1.updatePrice(50);
      System.out.println("Item: " + r1.getDesc() + ", No of units: " + r1.getUnits() + ", Price: " + r1.getPrice());
      System.out.println();

      System.out.println("Item: " + r2.getDesc() + ", No of units: " + r2.getUnits() + ", Price: " + r2.getPrice());
      System.out.println("Updating No of units and price of " + r2.getDesc());
      r2.updateUnits(500);
      r2.updatePrice(50);
      System.out.println("Item: " + r2.getDesc() + ", No of units: " + r2.getUnits() + ", Price: " + r2.getPrice());
   }
}