
public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {5, 2, 9, 1, 7};
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Maximum number in the array: " + max);
		
		
	}

}
