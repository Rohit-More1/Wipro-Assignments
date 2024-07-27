package billGenerator;

import java.util.Scanner;

public class BillGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Item[] items = new Item[]{
                new Item(1, "Sugar", 44),
                new Item(2, "Tea", 50),
                new Item(3, "oil", 100),
                new Item(4, "Rice", 60),
                new Item(5, "Chocalate", 2)
        };

        System.out.println("Available Items:");
        for (Item item : items) {
            System.out.println(item.getItemNumber() + ". " + item.getName() + " :" + item.getPrice());
        }

        System.out.println("Enter the item numbers :");
        String input = scanner.nextLine();
        String[] itemNumbers = input.split(" ");

        double totalBill = 0.0;
        for (String itemNumber : itemNumbers) {
            int itemNum = Integer.parseInt(itemNumber);
            for (Item item : items) {
                if (item.getItemNumber() == itemNum) {
                    totalBill += item.getPrice();
                }
            }
        }

        double discount = totalBill * 0.10;
        double netBill = totalBill - discount;

        System.out.println("Total Bill:" + totalBill);
        System.out.println("Discount (10%):" + discount);
        System.out.println("Net Bill:" + netBill);
    }
}





//Loop and Array: 1. Create a program to generate the item bill where you have item no, name, price . Find the total bill add discount of 10 % and find net bill 
