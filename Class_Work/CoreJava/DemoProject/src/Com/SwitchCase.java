package Com;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          
          System.out.println("Enter  ur student score");
          
          int score = scanner.nextInt();
          
          if(score<0 || score>100) {
        	  System.out.println("invalid score");
          }
          else {
        	  char grade=calculateGrade(score);
        	  System.out.println("Grade"+ grade);
          }
          scanner.close();
		
	
}
	public static char calculateGrade(int score) {
		char grade;
		switch (score / 10) {
		case 10:
		case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='c';
			break;
		case 6:
			grade='D';
			break;
		default:
			grade='F';
		 
		}
		return grade;
	}

}
