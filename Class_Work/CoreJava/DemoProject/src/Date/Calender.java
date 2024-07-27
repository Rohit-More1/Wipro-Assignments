package Date;

import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a new calandar
		Calendar cal = Calendar.getInstance();
		System.out.println("The cureent date is "+ cal.getTime());
		
		//print the firsy day of week
		System.out.println("first day is: " + cal.getFirstDayOfWeek());
		
		int day = cal.getFirstDayOfWeek();
		switch (day) {
		case (1):
			System.out.println("sunday");
		    break;
		case (2):
			System.out.println("monday");
		break;
		case (3):
			System.out.println("Tuesday");
		break;
		case (4):
			System.out.println("wed");
		break;
		case (5):
			System.out.println("thursday");
		break;
		case (6):
			System.out.println("friday");
		break;
		case (7):
			System.out.println("saturday");
		break;
		
		}
		
		
		

	}

}
