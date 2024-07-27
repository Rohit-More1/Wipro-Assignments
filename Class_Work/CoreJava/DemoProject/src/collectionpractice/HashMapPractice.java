package collectionpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice {

	public static void main(String[] args) {

		//HashMap
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		hm.put("a", 101);
		hm.put("c", 600);
		hm.put("b", 300);
		hm.put("d", 4000);
		
		
		hm.put(null, 4100);
		hm.put(null, 4100);
		
		hm.put(null, null);
		hm.put(null, null);
		
		Set<Map.Entry<String,Integer>> st=hm.entrySet();
		
		for(Entry<String,Integer>me1:st) {
			System.out.println(me1.getKey()+":");
			
		}

		

		
		
		
	}

}
