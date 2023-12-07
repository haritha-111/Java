import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        int[] array = {64, 34, 25, 12, 22, 11, 90};

		        for (int i = 0; i < array.length - 1; i++) {
		            for (int j = 0; j < array.length-i-1; j++) {
		                if (array[j] > array[j+1]) {
		                    // Swap elements if they are in the wrong order
		                    int temp = array[j];
		                    array[j] = array[j+1];
		                    array[j+1] = temp;
		                }
		            }
		        }
 
		        System.out.println("Sorted array: " + Arrays.toString(array));
		    }
       }
		
		
		
		
	


