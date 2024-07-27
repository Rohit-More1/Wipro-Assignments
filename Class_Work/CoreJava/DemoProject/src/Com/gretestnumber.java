package Com;

public class gretestnumber {

	public static void main(String[] args) {

		
		int a = 2;
        int b = 5;
        int c = 8;

        int greatestnumber;

        if (a >= b && a >= c) {
        	greatestnumber = a;
        } else if (b >= a && b >= c) {
        	greatestnumber = b;
        } else {
        	greatestnumber = c;
        }

        System.out.println("the greatest number is: " + greatestnumber);
	}

}
