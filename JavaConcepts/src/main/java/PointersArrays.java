
/* public class PointersArrays {

	 
	    public static void main(String[] args) {
	        int[] weights = {10, 20, 30, 40, 40, 50, 60};
	        int targetWeight = 60;

	        int smallest = 0;
	        int largest = weights.length - 1;
	        int boats = 1;

	        for (int i = 0; i < weights.length - 1; i++) {
	            for (int j = i + 1; j < weights.length; j++) {
	                if (weights[i] + weights[j] == targetWeight) {
	                    largest--;
	                    smallest++;
	                    boats++;
	                    
	                  
	                }  
	            }
	        }

	        System.out.println("Number of combinations: " + boats);
	    }
	}
*/

//using while loop

import java.util.Arrays;

public class PointersArrays {
    public static void main(String[] args) {
        int[] weights = {10, 20, 30, 40, 40, 50, 60, 60, 60};
        
      
        
    
        int targetWeight = 60;

        Arrays.sort(weights);
        for(int i = 0; i< weights.length; i++)
        	{
	        	System.out.println(weights[i]);
            }
        int smallest = 0;
        int largest = weights.length-1;
        int boats = 0;

        while (smallest <= largest) {
            
            if (weights[smallest] + weights[largest] <= targetWeight) {
                smallest++;
            }
            largest--;
            boats++;
        }

        System.out.println("Number of combinations: " + boats);
    }
}

