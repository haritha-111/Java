import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ListArray {
	//It initializes an ArrayList, adds several strings to it, and then iterates through the list using an Iterator
	//to print each element.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> myList = new ArrayList<String>();
		myList.add("Java");
		myList.add("Selenium");
		myList.add("C");
		myList.add("Python");
		myList.add("TestNG");
		myList.add("Selenium");
		
		Iterator<String> it = myList.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
	}
		
		
	}

