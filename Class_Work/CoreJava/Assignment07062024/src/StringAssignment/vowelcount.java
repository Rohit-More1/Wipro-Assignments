package StringAssignment;

public class vowelcount {

	public static void main(String[] args) {
String inputString = "wipro";
        
        String vowels = "aeiouAEIOU";
        
        int vowelCount = 0;
        int consonantCount = 0;
        
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            
            if (Character.isLetter(ch)) {

            	if (vowels.indexOf(ch) != -1) {
                    vowelCount += 1;
                } else {
                    consonantCount += 1;
                }
            }
        }
        
        System.out.println("Vowels: " + vowelCount + ", Consonants: " + consonantCount);
	}

}
