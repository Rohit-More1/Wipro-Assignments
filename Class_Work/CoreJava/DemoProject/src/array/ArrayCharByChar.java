package array;

public class ArrayCharByChar {

	public static void main(String[] args) {
         
        String[] names = {"XYZ","abc","pqr","lmn"};

		for (int i=0; i<names.length;i++)
			for(int j=0;j<names[i].length();j++) {
				System.out.println(names[i].charAt(j));
			}
		
		int []rohit= {1,2,3,4};
		for (int i=1; i<4;i++) {
			System.out.println(rohit[i]);
		}

		
	}

}



