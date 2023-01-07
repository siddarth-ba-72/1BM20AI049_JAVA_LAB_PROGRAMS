package cie_1_lab_cycle_practice_programs;

/*Question:-
Design and create a class named Retail Item that holds data about an item in a retail
store. The class should have the following fields:
i. Description - The description field references a String object that holds a brief
description of the item.
ii. Units - The unit’s field is an int variable that holds the number of units currently in
inventory.
iii. Price - The price field is a double that holds the item’s retail price.
Write a constructor that accepts arguments for each field, appropriate mutator methods
that store values in these fields, and accessor methods that return the values in these
fields. Write the main method which creates three Retail Item objects and invokes
appropriate methods.
*/

class RetailItems {
    private String description;
    private int units;
    private double price;

    RetailItems(String description, int units, double price) {
        this.description = description;
        this.units = units;
        this.price = price;
    }

    String getDesc() {
        return this.description;
    }

    int getUnits() {
        return this.units;
    }

    double getPrice() {
        return this.price;
    }

    void setDesc(String desc) {
        this.description = desc;
    }

    void setUnits(int units) {
        this.units = units;
    }

    void setPrice(double price) {
        this.price = price;
    }
}

public class _1b_retail_items {
    public static void main(String[] args) {

        // Created item 1 Samsung mobile
        RetailItems item1 = new RetailItems("Samsung Mobile", 150, 15800);
        System.out.println("\nItem-1: " + item1.getDesc());
        System.out.println("No of Units: " + item1.getUnits());
        System.out.println("Price: " + item1.getPrice());
        // Updated item 1 description
        item1.setDesc("Samsung Mobile Phones");

        System.out.println("\nItem-1: " + item1.getDesc());
        System.out.println("No of Units: " + item1.getUnits());
        System.out.println("Price: " + item1.getPrice());

        // Created item 2 Lenovo laptop
        RetailItems item2 = new RetailItems("Lenovo Laptop", 100, 65700);

        System.out.println("\nItem-2: " + item2.getDesc());
        System.out.println("No of Units: " + item2.getUnits());
        System.out.println("Price: " + item2.getPrice());
        // Updated item 2 no of units
        item2.setUnits(120);

        System.out.println("\nItem-2: " + item2.getDesc());
        System.out.println("No of Units: " + item2.getUnits());
        System.out.println("Price: " + item2.getPrice());

        // Created item 3 Boat earphones
        RetailItems item3 = new RetailItems("Boat earphones", 100, 550);

        System.out.println("\nItem-3: " + item3.getDesc());
        System.out.println("No of Units: " + item3.getUnits());
        System.out.println("Price: " + item3.getPrice());
        // Updated item 2 price
        item3.setPrice(600);

        System.out.println("\nItem-3: " + item3.getDesc());
        System.out.println("No of Units: " + item3.getUnits());
        System.out.println("Price: " + item3.getPrice());
    }
}
