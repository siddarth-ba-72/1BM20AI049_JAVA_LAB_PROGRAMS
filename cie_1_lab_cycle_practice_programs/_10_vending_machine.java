package cie_1_lab_cycle_practice_programs;

/* Question:-
Develop a Vending machine Interface which has following classes and interfaces:
i. Main
ii. VendingMachineInterface
iii. VendingMachine implements interface
iv. Calculator
After selection of all the items calculate the total price and display. Ignore number of
coins and display of coins.
*/

import java.util.HashMap;
import java.util.Map;

interface VendingMachineInterface {
    void displayProductMessage();

    void selectProduct(String item);

    void displayEnterCoinsMessage();

    void enterCoins(int... coins);

    void displayChangeMessage();
}

class VendingMachine implements VendingMachineInterface {

    private Calculator calc;
    private Map<String, Integer> products;
    private int totalCoins;
    private int itemPrice;
    private boolean productFound;

    public VendingMachine() {
        this.calc = new Calculator();
        this.products = new HashMap<>();
        this.totalCoins = 0;
        this.itemPrice = 0;
        this.productFound = true;
        products.put("Coke", 90);
        products.put("Sandwich", 50);
        products.put("Water", 20);
        products.put("Milkshake", 70);
        System.out.println("\n----- Welcome to MY VEND -----\n");
    }

    public boolean isProduct() {
        return this.productFound;
    }

    @Override
    public void displayProductMessage() {
        System.out.println("\nAvailable products:");
        for (Map.Entry<String, Integer> entry : products.entrySet())
            System.out.println(entry.getKey() + " - Rs." + entry.getValue());
    }

    @Override
    public void selectProduct(String item) {
        System.out.println("\nYou have selected: " + item);
        if (!products.containsKey(item)) {
            System.out.println("No such product");
            this.productFound = false;
            return;
        }
        this.itemPrice = products.get(item);
        System.out.println("Price of " + item + " is Rs." + this.itemPrice);
    }

    @Override
    public void displayEnterCoinsMessage() {
        System.out.print("Enter coins: ");
    }

    @Override
    public void enterCoins(int... coins) {
        for (int amt : coins) {
            System.out.print("Rs." + amt + "  ");
            totalCoins = calc.add(totalCoins, amt);
        }
        System.out.println("\nEntered amount: " + this.totalCoins);
    }

    @Override
    public void displayChangeMessage() {
        int change = calc.subtract(this.totalCoins, this.itemPrice);
        if (change < 0) {
            System.out.println("You still have to pay Rs." + (-change));
        }
        System.out.println("Balance change is Rs." + change);
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

public class _10_vending_machine {
    public static void main(String[] args) {
        VendingMachine vm_water = new VendingMachine();
        vm_water.displayProductMessage();
        vm_water.selectProduct("Water");
        if (vm_water.isProduct()) {
            vm_water.displayEnterCoinsMessage();
            vm_water.enterCoins(1, 5, 6, 9);
            vm_water.displayChangeMessage();
        }
        System.out.println("\nThanks for vending!");

        VendingMachine vm_biscuit = new VendingMachine();
        vm_biscuit.displayProductMessage();
        vm_biscuit.selectProduct("Orea Biscuit");
        if (vm_biscuit.isProduct()) {
            vm_biscuit.displayEnterCoinsMessage();
            vm_biscuit.enterCoins(1, 5, 6, 9);
            vm_biscuit.displayChangeMessage();
        }
        System.out.println("\nThanks for vending!");
    }
}
