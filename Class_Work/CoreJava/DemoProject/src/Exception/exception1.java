package Exception;

public class exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//example of arrayindexoutofbound
			int[] array = {1,2,3};
			System.out.println(array [10]);//accessing the index outofbound
			System.out.println("helo");
		}
		
		
		catch(ArrayIndexOutOfBoundsException ae) {//Built in exception
			System.out.println("array index out of bound exception occurreded:"+ae.getMessage());
	}
		finally {
			System.out.println("i am finally block");
		};
		System.out.println("i am java");

}
	}

