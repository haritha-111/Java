import java.util.HashSet;
import java.util.Set;

public class SetInJava {

	//In Java, a Set is a collection interface that does not allow duplicate elements. 
	//It is part of the Java Collections Framework and is implemented by classes like HashSet, LinkedHashSet, and TreeSet. Here's a simple example of using a Set in a Java program:
 

	    public static void main(String[] args) {
	        // Creating a HashSet (a type of Set)
	        Set<String> fruitsSet = new HashSet<String>();

	        // Adding elements to the Set
	        fruitsSet.add("Apple");
	        fruitsSet.add("Banana");
	        fruitsSet.add("Orange");
	        fruitsSet.add("Grapes");
	        fruitsSet.add("Apple"); // Adding a duplicate element, which will be ignored

	        // Displaying elements in the Set
	        System.out.println("Fruits in the Set:");
	        for (String fruit : fruitsSet) {
	            System.out.println(fruit);
	        }

	        // Checking if the Set contains a specific element
	        String searchFruit = "Banana";
	        if (fruitsSet.contains(searchFruit)) {
	            System.out.println(searchFruit + " is present in the Set.");
	        } else {
	            System.out.println(searchFruit + " is not present in the Set.");
	        }

	        // Removing an element from the Set
	        String removedFruit = "Orange";
	        fruitsSet.remove(removedFruit);

	        // Displaying the updated Set
	        System.out.println("\nFruits in the Set after removing " + removedFruit + ":");
	        for (String fruit : fruitsSet) {
	            System.out.println(fruit);
	        }
	    }
	}