package Com;

import java.util.Scanner;

public class scannerobject {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter your name");
		String name = scanner.nextLine();
		System.out.println("Hello,"+name+"!");
		
		System.out.println("enter your age");
		int age = scanner.nextInt();
		System.out.println("You are ,"+age+"years old");
		
		scanner.close();
		
		
	}

}
