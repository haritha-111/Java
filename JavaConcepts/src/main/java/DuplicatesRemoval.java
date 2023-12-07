import java.util.Arrays;
public class DuplicatesRemoval {

	

	 
	    public static void main(String[] args) {
	        // Original array with duplicates
	        int[] originalArray = {1, 2, 3, 2, 4, 5, 6, 1};

	        // Remove duplicates using a for loop
	        int[] uniqueArray = removeDuplicates(originalArray);

	        // Display the unique array
	        System.out.println(Arrays.toString(uniqueArray));
	    }

	    private static int[] removeDuplicates(int[] array) {
	        int length = array.length;
	        int[] uniqueArray = new int[length];
	        int uniqueCount = 0;

	        for (int i = 0; i < length; i++) {
	            int currentElement = array[i];
	            boolean isDuplicate = false;

	            // Check if the current element is a duplicate
	            for (int j = 0; j < uniqueCount; j++) {
	                if (uniqueArray[j] == currentElement) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            // If not a duplicate, add it to the uniqueArray
	            if (!isDuplicate) {
	                uniqueArray[uniqueCount] = currentElement;
	                uniqueCount++;
	            }
	        }

	        // Resize the array to remove unused slots
	        return Arrays.copyOf(uniqueArray, uniqueCount);
	    }
	
	}

