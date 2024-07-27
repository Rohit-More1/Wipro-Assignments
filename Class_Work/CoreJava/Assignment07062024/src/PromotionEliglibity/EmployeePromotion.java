package PromotionEliglibity;

import java.util.Scanner;

public class EmployeePromotion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();
        
        scanner.nextLine();

        System.out.print("Enter your performance rating (excellent/good/average): ");
        String performanceRating = scanner.nextLine().toLowerCase();

        System.out.print("Have you completed at least one advanced training program? (yes/no): ");
        String trainingStatus = scanner.nextLine().toLowerCase();

        boolean eligibleForPromotion = yearsOfService >= 5 && performanceRating.equals("excellent") && trainingStatus.equals("yes");

        if (eligibleForPromotion) {
            System.out.println("Congratulations! You are eligible for a promotion.");
        } 
        else {
            System.out.println("Sorry, you are not eligible for a promotion.");
        }

        scanner.close();
    }
}
