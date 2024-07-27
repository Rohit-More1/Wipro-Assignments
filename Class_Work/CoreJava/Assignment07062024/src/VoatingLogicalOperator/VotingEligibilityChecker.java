package VoatingLogicalOperator;

import java.util.Scanner;

public class VotingEligibilityChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a citizen of the country? (Enter the yes/no): ");
        String citizenship = scanner.next();

        System.out.print("Have you been convicted of a felony? (Enter the yes/no): ");
        String felony = scanner.next();

        if (age >= 18 && citizenship.equalsIgnoreCase("yes") && felony.equalsIgnoreCase("no")) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}





//Logical Operator(COMPLETE)
//
//
//Voting Eligibility Checker:
//  Create a program that determines whether a person is eligible to vote in an election based on the following criteria:
//Age must be 18 or above.
//Must be a citizen of the country.
//Prompt the user to input their age, citizenship status (yes/no), and felony status (yes/no), and then use complex logical expressions to determine and output whether they are eligible to vote.