package java8featureFunctionalinterface;

public class Test implements MyFirstFunctionalInterface {

	@Override
	public void firstwork() {
		// TODO Auto-generated method stub
		System.out.println("first interface");
		
	}
	public static void main (String[] args) {
		Test t1= new Test();
		t1.firstwork();
		t1.show();
		t1.show1();
		t1.show2();


		
	}

}
