
public class CoreJavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String is an object that represents sequence of chars
		
		String s = "Rahul Shetty Academy";
		String S1 = "Rahul Shetty Academy";
		
		
		//using new
		String S2 = new String("Welcome");		
		String S3 = new String("Welcome");
		
		
		//Using literal string, the same values if using , then the memory will not be created for diff variables
		//where as new each or duplicate aslo wuold be created
		
		String s4 = "Rahul  shetty  academy";
		String[]  splittedString = s4.split("Shetty");
		
		//System.out.println(splittedString[0]);
		//System.out.println(splittedString[1]);	
	//System.out.println(splittedString[1].trim());
		
		for(int i=0; i<s4.length(); i++)
		{
		 
			System.out.println(s.charAt(i)); 
			
		
		}
		
		//Reverse string printing in output
		for(int i=s4.length()-1; i>0;  i--)
		{
		 
			System.out.println(s.charAt(i)); 
			
		
		}
		
	}

}
