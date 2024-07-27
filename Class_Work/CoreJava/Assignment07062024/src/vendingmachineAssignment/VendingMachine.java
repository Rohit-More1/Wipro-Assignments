package vendingmachineAssignment;

import java.util.Scanner;

public class VendingMachine {
    private Product[] products;

    public VendingMachine() {
        products = new Product[]{
                new Product("Sprite", 15),
                new Product("Chips", 5),
                new Product("DairyMilk", 10),
                new Product("Popcorn", 20),
                new Product("WaterBottle", 20)
        };
    }

    public void displayMenu() {
        System.out.println("Available Products:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i].getName() + " : " + products[i].getPrice());
        }
    }

    public double selectProduct(int productCode) {
        if (productCode < 1 || productCode > products.length) {
            System.out.println("Invalid selection. Please try again.");
            return -1;
        }
        return products[productCode - 1].getPrice();
    }

    public double calculateChange(double price, double amountPaid) {
        if (amountPaid < price) {
            System.out.println("Insufficient amount paid. Please try again.");
            return -1;
        }
        return amountPaid - price;
    }

    public void dispenseItem(int productCode) {
        if (productCode < 1 || productCode > products.length) {
            System.out.println("Invalid selection. Cannot dispense item.");
        } else {
            System.out.println("Dispensing " + products[productCode - 1].getName());
        }
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            vendingMachine.displayMenu();

            System.out.print("Enter the product number: ");
            int productCode = scanner.nextInt();

            double price = vendingMachine.selectProduct(productCode);
            if (price == -1) {
                continue;
            }

            System.out.print("Enter the amount paid: ");
            double amountPaid = scanner.nextDouble();

            double change = vendingMachine.calculateChange(price, amountPaid);
            if (change == -1) {
                continue;
            }

            vendingMachine.dispenseItem(productCode);
            System.out.printf("Change returned: %.2f%n", change);
        }
    }}
