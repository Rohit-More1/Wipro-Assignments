package GradeCalculator;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student score: ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("score is not within the range of 0 to 100");
        } else {
            String grade;
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("Grade: " + grade);
        }
    }
}


//Grade Calculator:
//You are tasked with creating a grade calculator program. The program should take a student's score as input and output their corresponding grade based on the following criteria:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: Below 60
//Ensure that if the input score is not within the range of 0 to 100, the program outputs an error message.
//
