package Exception;

public class ExceptinThrow {

	//method using throw keyword to manually throw an exception
	public static void checkAge(int age) throws ArithmeticException,RuntimeException{
		if(age<18) {
			throw new ArithmeticException("underage person cannot be processed");
		}
		else {
			System.out.println("age is valid");
		}
		
		if(age>=50) {
			
		}
	}
	

}
