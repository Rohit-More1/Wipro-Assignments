package array;

public class declareArray {

	public static void main(String[] args) {
         String[] names = {"XYZ","abc","pqr","lmn"};
         
         
         //using for loop
         for(int i=1;i<= names.length;i++) {
        	 System.out.println(names[i]);
         }
         
         
         //for each- read the array only
		for(String name:names)
			System.out.println(name);
	}

}
