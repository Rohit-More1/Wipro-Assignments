package Java8.Feature.Lamda;

import java.util.ArrayList;
import java.util.List;

public class TestLambda_01 {

	public static void main(String[] args) {

		//case 1
		List<String> al = new ArrayList<String>();
		al.add("java");
		al.add("mysql");
		
		al.forEach(x ->  {System.out.println(x);});
		
		
		//case 2// Lambda exprssion without return keyword
		Addable ad1=(a,b)->(a+b);
		System.out.println(ad1.add(10,20));
		
		
		//case 3 // lambda with return keyword
		Addable ad2= (int a, int b)->{return (a+b); };
		System.out.println(ad2.add(100,200));
	}

}
