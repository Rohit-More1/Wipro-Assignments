package CreaditCard;

import java.util.Scanner;

public class CreditCardApproval {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your credit score: ");
        int creditScore = scanner.nextInt();
        
        System.out.print("Enter your total debt amount: ");
        double debtAmount = scanner.nextDouble();
        
        System.out.print("Enter your total annual income: ");
        double incomeAmount = scanner.nextDouble();
        
        scanner.nextLine();

        System.out.print("Have you declared bankruptcy within the last 5 years? (yes/no): ");
        String bankruptcyStatus = scanner.nextLine().toLowerCase();

        double debtToIncomeRatio = (debtAmount / incomeAmount) * 100;

        boolean approvedForCreditCard = creditScore >= 700 && debtToIncomeRatio <= 30 && bankruptcyStatus.equals("no");

        if (approvedForCreditCard) {
            System.out.println("You are approved for the credit card.");
        } else {
            System.out.println("you are not approved for the credit card.");
        }

        scanner.close();
    }
}
