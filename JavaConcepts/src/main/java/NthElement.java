import java.util.Scanner;

public class NthElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);

	       // int[] arrN = {1, 2, 3, 4, 5};
	       
	       
	       int[] arrN = {67,78,23,90,12};
	       

	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();

	        int len = arrN.length;

	        // Print the nth element from the end
	        if (n >= 1 && n <= len) {
	            System.out.println("The " + n + "th element from the end is: " + arrN[len - n]);
	        } else {
	            System.out.println("Invalid value of n");
	        }

	        // Close the scanner
	        scanner.close();
	     
	}

}
