package com.add;
//
//public class UseAddress {
//    public static void main(String[] args) {
//        Address address = new Address(1, "Delhi", "Bhopal", "456789");
//
//        System.out.println("Initial Address Details:");
//        address.displayAddress();
//        
//        address.setAddId(2);
//
//        address.setCity("Mumbai");
//        address.setState("Maha");
//        address.setPinched("123451");
//
//        System.out.println("\nUpdated Address Details:");
//        address.displayAddress();
//    }
//}




import com.add.Address;
import java.util.Scanner;

public class UseAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Address ID:");
        int addId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter City:");
        String city = scanner.nextLine();

        System.out.println("Enter State:");
        String state = scanner.nextLine();

        System.out.println("Enter Pincode:");
        String pinched = scanner.nextLine();

        Address address = new Address(addId, city, state, pinched);

        address.displayAddress();

        System.out.println("\nUpdate the Address values:");

        System.out.println("Enter new City:");
        city = scanner.nextLine();
        address.setCity(city);

        System.out.println("Enter new State:");
        state = scanner.nextLine();
        address.setState(state);

        System.out.println("Enter new Pinched:");
        pinched = scanner.nextLine();
        address.setPinched(pinched);

        System.out.println("\nUpdated Address:");
        address.displayAddress();
    }
}
