package collectionpractice;
//import java.util.*;

import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList {

	public static void main(String[] args) {
  
		java.util.ArrayList<String> list1 = new  java.util.ArrayList<String>();
		
		list1.add("ONE");
		list1.add("TWO");
		list1.add(null);
		list1.add("ONE");

		
//approch 1
		System.out.println("traverse element using loop");
		for(int i=0;i<5;i++) {
			System.out.println(list1.get(i));
		}
		
		//approch 2
		System.out.println("tranverse elemnt using the fr each lopp");
		for( String num:list1) {
			System.out.println(num);
		}
		
		//approch 3
		System.out.println("print elemnt through ityerator");
		Iterator<String> iterat = list1.iterator(); //in forward direction
		
		while(iterat.hasNext()) {
			System.out.println("the elemnt is:"+iterat.next());
		}
		
		//Approach 4:to reverse the collection element
		System.out.println("traverse elemnt using listiterator");
		ListIterator<String> literat = list1.listIterator();  //moves backward and forward
		
		while(literat.hasNext()) {
			System.out.println("the next element is"+literat.next());
			
		}
		
		while(literat.hasPrevious()) {
			System.out.println("the previous elemnt is:"+literat.previous());
		}
		
		
	}

}
