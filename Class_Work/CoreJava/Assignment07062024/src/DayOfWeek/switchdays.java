package DayOfWeek;

import java.util.Scanner;

public class switchdays {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number (1-7) to get the day of the week: ");
	        int dayNumber = scanner.nextInt();
	        
	        String dayName;

	        switch (dayNumber) {
	            case 1:
	                dayName = "Sunday";
	                break;
	            case 2:
	                dayName = "Monday";
	                break;
	            case 3:
	                dayName = "Tuesday";
	                break;
	            case 4:
	                dayName = "Wednesday";
	                break;
	            case 5:
	                dayName = "Thursday";
	                break;
	            case 6:
	                dayName = "Friday";
	                break;
	            case 7:
	                dayName = "Saturday";
	                break;
	            default:
	                dayName = "Invalid day number";
	                break;
	        }

	        System.out.println("The day is: " + dayName);
	        
	        scanner.close();

	}

}


// Day of the Week:
//Write a program that prompts the user to enter a number between 1 and 7 representing a day of the week (1 for Sunday, 2 for Monday, and so on). Use a switch statement to determine the day entered by the user and output the corresponding day name. If the user enters a number outside the range of 1-7, display an error message.(Completedd)
