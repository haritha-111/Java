import java.util.ArrayList;
import java.util.List;
	
public class CollectionsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        // Creating an ArrayList of Strings
		        List<String> fruits = new ArrayList<String>();

		        // Adding elements to the ArrayList
		        fruits.add("Apple");
		        fruits.add("Banana");
		        fruits.add("Orange");
		        fruits.add("Grapes");

		        // Displaying elements using a for-each loop
		        System.out.println("Fruits in the list:");
		        for (String fruit : fruits) {
		            System.out.println(fruit);
		        }

		        // Checking if the list contains a specific element
		        String searchFruit = "Banana";
		        if (fruits.contains(searchFruit)) {
		            System.out.println(searchFruit + " is present in the list.");
		        } else {
		            System.out.println(searchFruit + " is not present in the list.");
		        }

		        // Removing an element from the list
		        String removedFruit = "Orange";
		        fruits.remove(removedFruit);

		        // Displaying the updated list
		        System.out.println("\nFruits in the list after removing " + removedFruit + ":");
		        for (String fruit : fruits) {
		            System.out.println(fruit);
		        }
		    }
		
	}


