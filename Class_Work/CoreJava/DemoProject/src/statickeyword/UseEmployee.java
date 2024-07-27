package statickeyword;

public class UseEmployee {
	static {
		System.out.println("Here is  a static Block(Static block always executed before the main method)");
	}
	
	public static void main(String[] args) {
		System.out.println("Here is a an main Methode");
		Employee e1 = new Employee("xyz",123456);
		System.out.println(e1);
		Employee e2 = new Employee("abc",456123);
		System.out.println(e2);
		Employee e3 = new Employee("pqr",795315);
		System.out.println(e3);
		Employee e4 = new Employee("wer",58421);
		System.out.println(e4);
		Employee e5 = new Employee("xcv",54855);
		System.out.println(e5);
		System.out.println(Employee.no);
		System.out.println(Employee.Company);
	}
 
}