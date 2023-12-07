 
public class CoreJavaBrushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum = 5;
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		//float dec =  4.5;
		double dec1 = 9.7;
		boolean myCard = true;
		
		System.out.println(myNum+ "is the stored in myNUm variable");
		System.out.println(website);
		
		//Arrays - can store multiple values in one signle variable
		//THe size of array has fixed when initialising, later we cannot push morethan more values as defined
		//New operator will allocate memory
		
		
		int[] arr = new int[6];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		arr[5] = 7;
		
	int[] arr1 = {1,2,4,5,6,7};
	//To access an item from array
	
	System.out.println(arr1[2]);
	
	
	//Print the values in array using FOR loop , here arr1.length is 5
	for(int i = 0; i< arr1.length; i++)
	{
	
	
		System.out.println(arr1[i]);

		
		
	}
	
	
	for(int i = 0; i< arr.length; i++)
	{
	
	
		System.out.println(arr1[i]);

		
		
	}
	
	String[] name = {"rahul", "haritha", "uday","Yashu"};
	
	for(int i = 0; i< name.length; i++)
	{
	
	
		System.out.println(name[i]);

		
		
	}
//Enhanced FOR loop syntax
	for (String s: name)
	{
	
		System.out.println(s);

	}
	
}
	
}
