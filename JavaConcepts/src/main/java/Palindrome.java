import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//one that reads the same forwards as backwards, an example of which is 17071
		
		/*
		 * The code initializes a Scanner to read input from the user.
The user is prompted to enter a number, and the input is stored in the variable num.
The program then uses a while loop to reverse the digits of the entered number.
After the loop, the original and reversed numbers are printed.
Additionally, there's a check to see if the original and reversed numbers are the same, indicating a palindrome.
		 */
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num:");
		num = sc.nextInt();
		
		int a=num;
		int reverse = 0;
		int remainder;
		
		while(num>0) {
			
			remainder =num%10;
			reverse = reverse *10 +remainder;
			
			num=num/10;
			
			
		}
		
		if(reverse==a)
			System.out.println(a+"is a Palindrom Number");
		else
			
			System.out.println(a+"is a Not a Palindrom Number");

			
	}

}
