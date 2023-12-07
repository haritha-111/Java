
public class WeightsinKGsJava {

	
	    public static void main(String[] args) {
	        int[] weights = {10, 20, 30, 40, 50};
	        int targetWeight = 50;

	        findCombinations(weights, targetWeight);
	        
	    }
	    

	    private static void findCombinations(int[] weights, int target) {
	        System.out.println("Combinations of 2 weights that sum to " + target + " kgs:");

	        for (int i = 0; i < weights.length - 1; i++) {
	            for (int j = i + 1; j < weights.length; j++) {
	                if (weights[i] + weights[j] == target) {
	                    System.out.println(weights[i] + " kgs + " + weights[j] + " kgs");
	                }
	            }
	        }

	    }
	    }
	    
