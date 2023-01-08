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

    void selectProduct(String... items);

    void displayEnterCoinsMessage();

    void enterCoins(int... coins);

    void displayChangeMessage();
}

class VendingMachine implements VendingMachineInterface {

    private Calculator calc;
    private Map<String, Integer> products;
    private int totalCoins;
    private int totalPrice;

    public VendingMachine() {
        this.calc = new Calculator();
        this.products = new HashMap<>();
        this.totalCoins = 0;
        this.totalPrice = 0;
        products.put("Coke", 90);
        products.put("Sandwich", 50);
        products.put("Water", 20);
        products.put("Milkshake", 70);
        System.out.println("\n----- Welcome to MY VEND -----\n");
    }

    @Override
    public void displayProductMessage() {
        System.out.println("\nAvailable products:");
        for (Map.Entry<String, Integer> entry : products.entrySet())
            System.out.println(entry.getKey() + " - Rs." + entry.getValue());
    }

    @Override
    public void selectProduct(String... items) {
        System.out.println("\nYour selected items:-");
        for (String item : items) {
            if (!products.containsKey(item)) {
                System.out.println(item + " Not availabe");
                continue;
            }
            System.out.println(item + ": " + products.get(item));
            totalPrice += products.get(item);
        }
        System.out.println("\nTotal amount: " + this.totalPrice);
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
        int change = calc.subtract(this.totalCoins, this.totalPrice);
        if (change < 0)
            System.out.println("You still have to pay Rs." + (-change));
        else
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
        VendingMachine vm = new VendingMachine();
        vm.displayProductMessage();
        vm.selectProduct("Water", "Cake", "Milkshake");
        vm.displayEnterCoinsMessage();
        vm.enterCoins(22, 25, 25, 3);
        vm.displayChangeMessage();
    }
}
