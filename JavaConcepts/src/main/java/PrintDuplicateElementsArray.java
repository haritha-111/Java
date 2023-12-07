
public class PrintDuplicateElementsArray {

		    public static void main(String[] args){
	        int[] array = {10, 20, 30, 40, 50, 50, 60, 60, 60};

	        int mostDuplicateElement = 0;
	        int mostDuplicateCount = 0;

	        for (int i = 0; i < array.length - 1; i++) {
	            int currentElement = array[i];
	            int currentCount = 1;

	            if (currentElement == -1) {
	                // Skip if the element is already counted as a duplicate
	                continue;
	            }

	            for (int j = i + 1; j < array.length; j++) {
	                if (currentElement == array[j]) {
	                    currentCount++;
	                    array[j] = -1; // Mark the duplicate element
	                }
	            }

	            if (currentCount > 1) {
	                System.out.println("Duplicate element: " + currentElement + ", Count: " + currentCount);

	                if (currentCount > mostDuplicateCount) {
	                    mostDuplicateCount = currentCount;
	                    mostDuplicateElement = currentElement;
	                }
	            }
	        }

	        if (mostDuplicateCount > 1) {
	            System.out.println("Most duplicated element: " + mostDuplicateElement + ", Count: " + mostDuplicateCount);
	        } else {
	            System.out.println("No duplicates found.");
	        }
	    
		    
}

	/*In this example, the inner loop checks for duplicates of the current element,
	 * and if found, marks them as -1 to avoid counting them again.
	 * The most duplicated element and its count are also tracked during the process.
	 * The final result is printed at the end of the program.
	 * */
	 */
		    
	
		    //using set 
		    
		  /*   public class PrintDuplicates {
		        public static void main(String[] args) {
		            int[] array = {10, 20, 30, 40, 50, 50, 60, 60, 60};

		            Set<Integer> uniqueElements = new HashSet<>();
		            Set<Integer> duplicateElements = new HashSet<>();

		            for (int value : array) {
		                if (!uniqueElements.add(value)) {
		                    // If it's not added to the set, it's a duplicate
		                    duplicateElements.add(value);
		                }
		            }

		            System.out.println("Duplicate elements: " + duplicateElements);
		        }
		    }
*/