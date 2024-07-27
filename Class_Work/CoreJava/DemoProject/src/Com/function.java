package Com;

public class function {

	public static void main(String[] args) {
         int n1=10;
         int n2=20;
         
         addition(n1,n2);
         sub();
         //sub();

	}
	public static void addition(int a, int b) {
		
		int n3= a+b;
		//System.out.println(n3);
		System.out.println("addition of n1 and n2:" +n3);
		
	}
	public static void sub() {
		int n1=20;
		int n2=10;
		int n3= n1-n2;
		//System.out.println(n3);
		System.out.println("sub of n1 and n2 is :"+n3);
	}

}
