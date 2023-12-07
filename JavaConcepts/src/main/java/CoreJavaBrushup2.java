import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr1 = {1,2,4,5,6,7,8,10};
		//get the numbers which got multiplied by 2
		
		//CHeck this array has any multiple of 2
		
		for(int i = 0; i< arr1.length; i++)
		{
		
		if (arr1[i] % 2 == 0)
		{
			System.out.println(arr1[i]);
			break;
				
		}
		else
		{
			System.out.println(arr1[i]+ "is not multiple of 2");
		}
		
		
	}
//Array list (dynamicaaly if any item added to the Array then we use the arryalist
		
		List<String> a = new ArrayList<String>();
		//Create object of class
		a.add("haritha");
		a.add("uday");
		a.add("Yashu");
		a.add("Family");
		a.remove(2);
		System.out.println(a.get(2));
		
		for(int i = 0; i<a.size(); i++)
		{
		
		System.out.println(a.get(i));
		
		
		}
		
		System.out.println("*************");
		for( String val: a)
		{
		
		System.out.println(val);
		
		
		}
		
		//Item present in Arraylist
		
		System.out.println(a.contains("Haritha"));
		
		
		//Converting normal array into arraylist and checking the item is present in arraylist or not
		String[] name = {"Haritha","uday","yashu","Family"};
		List<String> nameArrayList = Arrays.asList(name);
		nameArrayList.contains("Haritha");
		
		
		
		
}
}
