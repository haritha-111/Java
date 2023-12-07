
public class evenNumbersinARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Even numbers in the array:");
        for (int number : array) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

	}

}
