import java.util.Scanner;

public class MultiDimensionalArray {

	  public static void reverse(int[][] arr){

		 int rows = arr.length;
		    int cols = arr[0].length;
		    int array[][]=new int[rows][cols];
		    for(int i = rows-1; i >= 0; i--) {
		        for(int j = cols-1; j >= 0; j--) {
		            array[rows-1-i][cols-1-j] = arr[i][j];
		        }
		    }
		    for(int i = 0; i < rows; i++) {
		        for(int j = 0; j < cols; j++) {
		            System.out.print(array[i][j]+" ");
		            }
		     }
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int rows, cols;
	    int[][] arr;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter number of rows greater than 4: ");
	    rows = sc.nextInt();
	    System.out.print("Enter number of columns greater than 4: ");
	    cols = sc.nextInt();
	    arr = new int[rows][cols];
	    System.out.println("Enter elements of Array");
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            arr[i][j] = sc.nextInt();
	        }
	    }
	    System.out.println("Array is: ");
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	        System.out.print(arr[i][j]+" ");
	        }
	    }
	    System.out.println();
	    reverse(arr);

	}

}
