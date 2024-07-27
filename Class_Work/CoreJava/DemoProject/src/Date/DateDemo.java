package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//current date and time
		Date currentdate = new Date();
		System.out.println("current date and time"+ currentdate);
		
		
		//creating a date using milliseconds
		long milliseconds=1617971200000L;//represent April 10, 2021
		Date dateFromMillisecond= new Date(milliseconds);
		System.out.println("date from millisecond" + dateFromMillisecond);

		//Parsing a string create a date
		String dateString="2021-04-01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		
		// formatting Date
		SimpleDateFormat sdf2= new SimpleDateFormat("EEEE,MMMM dd,yyyy 'at' hh:mm:ss a");
		String formattedDate = sdf2.format(currentdate);
		System.out.println("Formatted Date: " +formattedDate);
	}

}
