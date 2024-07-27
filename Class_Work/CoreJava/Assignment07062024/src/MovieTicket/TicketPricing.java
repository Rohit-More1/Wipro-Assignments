package MovieTicket;

import java.util.Scanner;

public class TicketPricing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Prompt user for movie type
        System.out.print("Enter the type of movie (regular/3D): ");
        String movieType = scanner.next();
        
        int ticketPrice = 0;

        // Determine ticket price based on age and movie type
        if (movieType.equalsIgnoreCase("regular")) {
            if (age < 18) {
                ticketPrice = 8;
            } else {
                ticketPrice = 12;
            }
        } else if (movieType.equalsIgnoreCase("3D")) {
            if (age < 18) {
                ticketPrice = 10;
            } else {
                ticketPrice = 15;
            }
        } else {
            System.out.println("Error: Invalid movie type entered.");
            scanner.close();
            return; // Exit the program if the movie type is invalid
        }

        // Output the ticket price
        System.out.println("The ticket price is: $" + ticketPrice);
        
        scanner.close();
    }
}




//2. Ticket Pricing:(Complete)
//You are designing a ticket pricing program for a movie theater. The program should prompt the user for their age and the type of movie they want to watch (e.g., "regular" or "3D"). Based on the age and movie type, the program should calculate and output the ticket price according to the following rules:
//Regular Movie:
//Age < 18: $8
//Age >= 18: $12
//3D Movie:
//Age < 18: $10
//Age >= 18: $15
