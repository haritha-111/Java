
public class LargestString {

	  
	    public static void main(String[] args) {
	        String inputString = "hello greatworld";

	        String largestWord = findLargestWord(inputString);

	        System.out.println("The largest word is: " + largestWord);
	    }

	    private static String findLargestWord(String input) {
	        if (input == null || input.isEmpty()) {
	            // Handle the case where the input is empty or null
	            return null;
	        } 

	        String[] words = input.split("\\s+"); // Split the string into words using whitespace as a delimiter
	        String largestWord = words[0]; // Assume the first word is the largest

	        for (String word : words) {
	            if (word.length() > largestWord.length()) {
	                largestWord = word;
	            }
	        }

	        return largestWord;
	    }
	}


