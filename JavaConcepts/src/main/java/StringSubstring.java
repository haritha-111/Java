
public class StringSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String originalString = "Hello, World!";
	        
	        // Example 1: Get substring from index 7 to the end
	        String substring1 = originalString.substring(7);
	        System.out.println("Substring 1: " + substring1);

	        // Example 2: Get substring from index 0 to 5 (exclusive)
	        String substring2 = originalString.substring(0, 5);
	        System.out.println("Substring 2: " + substring2);
	}

}
// 7 indicates the index value from the string, 0 -4 index values will pick

// Using entire string
/* public class SubstringExample {
public static void main(String[] args) {
    String inputString = "abcd";

    System.out.println("All substrings of '" + inputString + "':");

    for (int start = 0; start < inputString.length(); start++) {
        for (int end = start + 1; end <= inputString.length(); end++) {
            String substring = inputString.substring(start, end);
            System.out.println(substring);
        }
    }
}
}

*/