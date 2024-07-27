package Exception;

public class ExceptionPractice {

	public static void main(String[] args) {

		try {
			//example of arrayindexoutofbound
			int[] array = {1,2,3};
			System.out.println(array [1]);//accessing the index outofbound
			
			//example of ArithematicException
			int result = 10/0;  //dividion by zero
			System.out.println("result is"+result);
			
			//example of nullPointerException
			String str ="ss";
			System.out.println(str.length());//accessing length of null string
			//system.exit(1);
	
		}
		
		catch(ArrayIndexOutOfBoundsException ae) {//Built in exception
			System.out.println("array index out of bound exception occurreded:"+ae.getMessage());
			
		}catch(ArithmeticException e) {
			System.out.println("Arethmatic exception found "+e.getMessage());
		
		}catch(NullPointerException e) {
			System.out.println("null pointer exception occured:"+e.getMessage());
		
		}catch(Exception e) {
			System.out.println("something went wrong");
		
		}
		finally {
			System.out.println("i am finally block");
		}
		
	}

}
