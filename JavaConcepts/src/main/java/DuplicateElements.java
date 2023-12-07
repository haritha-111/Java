import java.util.Arrays;
public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int[] array = {10, 20, 30, 40, 50, 50, 60, 60, 60};

        Arrays.sort(array);

        int[] ac = new int[array.length];
        int k = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    ac[k] = array[i];  // Store the duplicate element in ac
                    k++;
                    break;  // exit the inner loop once a duplicate is found for the current i
                }
            }
        }

        // Print the duplicate elements
        System.out.println("Duplicate elements:");
        for (int i = 0; i < k; i++) {
            System.out.println(ac[i]);
        }
    }
}



//to print the duplicate Elements count

/* import java.util.Arrays;

public class CountDuplicates {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 50, 60, 60, 60};

        Arrays.sort(array);

        int duplicateCount = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicateCount++;
                    break;  // exit the inner loop once a duplicate is found for the current i
                }
            }
        }

        // Print the count of duplicates
        System.out.println("Number of duplicates: " + duplicateCount);
    }
}
*/

/* Final program is good to handle*****

import java.util.Arrays;

public class DuplicateElementsWithCount {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 50, 60, 60, 60};

        Arrays.sort(array);

        int[] duparray = new int[array.length];
        int[] countarray = new int[array.length];
        int k = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duparray[k] = array[i];
                    countarray[k]++;
                    k++;
                }
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.println("Duplicate Element: " + duparray[i] + ", Count: " + countarray[i]);
        }
    }
}




/* public class DuplicateElementsWithCount {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 50, 60, 60, 70};

        Arrays.sort(array);

        int duparray[] = new int[array.length];
        int countarray[] = new int[array.length];
        int k = 0;
        

        for (int i = 0; i < array.length - 1; i++) {
            int counter = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                   }
            } 
            if(counter>1){
            countarray[k] = counter;
            duparray[k] = array[i];
            k++;
            }
            
        }

        duparray = Arrays.copyOf(duparray, k);
        countarray =Arrays.copyOf(countarray, k);
            System.out.println("Duplicate Element: " + Arrays.toString(duparray)  + ", Count: " + Arrays.toString(countarray));
    
    }
}
*/
