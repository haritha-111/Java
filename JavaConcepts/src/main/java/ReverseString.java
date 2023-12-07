
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		    String input = "Hello, World!";
		        char[] charArray = input.toCharArray();

		        for (int i = charArray.length - 1; i >= 0; i--) {
		            System.out.print(charArray[i]);
		        }
		    }
	

}
