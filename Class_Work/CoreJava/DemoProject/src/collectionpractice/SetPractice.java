package collectionpractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args, char[] uniqueNumbers) {
           
		List<Integer> listNumber= Arrays.asList(3,9,1,4,3,8,8,6,8,7,2,3);
	System.out.println(listNumber);
	
	Set<Integer> s= new HashSet<>();
	//char[] uniqueNumber = null;
	System.out.println(uniqueNumbers);
	
	//Add elemnts
	Set<String> names= new HashSet<>();
	names.add("Tom");
	names.add("Mary");
	
	if (names.add("Peter")) {
		System.out.println("Peter is added");}
	
	if(!names.add("Tom")) {
		System.out.println("Tom is already in a set");}
	
	//Traverse all elements
	Iterator<String> iterator = names.iterator();
	while (iterator.hasNext()) {
		String name= iterator.next();
		System.out.println(name);
	}
	
	//search an element
	if(names.contains("Mary")) {
		System.out.println("Found Mary");
	}
	
	//Bulk Operations
	//a.subset
	Set<Integer> s1 = new HashSet<>(Arrays.asList(20,52,89,31,8,5));
	Set<Integer> s2 = new HashSet<>(Arrays.asList(8,89));
	
	if(s1.containsAll(s2)) {
		System.out.println("s2 is subset of s1");
	}
	
	//b.union
	s1.addAll(s2);
	System.out.println("s1 afetr union"+s1);
	
	//c.intersection
	s1.retainAll(s2);
	System.out.println("s1 after intersection"+s1);

	
	}
	

}
