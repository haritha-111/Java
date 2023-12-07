import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import java.util.Set;

public class FourthWindow {

	
	 
	    public static void main(String[] args) {
	        // Set the path to the chromedriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Create a new instance of the Chrome driver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to a webpage that opens multiple windows
	        driver.get("https://example.com");

	        // Perform an action that opens new windows (e.g., clicking a link)
	        // ...

	        // Get all window handles
	        Set<String> windowHandles = driver.getWindowHandles();

	        // Check if there are at least 4 windows open
	        if (windowHandles.size() >= 4) {
	            // Switch to the 4th window (index 3, as it is 0-based)
	            int windowIndex = 3;
	            String windowHandleToSwitch = (String) windowHandles.toArray()[windowIndex];
	            driver.switchTo().window(windowHandleToSwitch);

	            // Now you are on the 4th window, and you can perform actions
	            // ...

	            // For example, print the title of the current window
	            System.out.println("Title of the 4th window: " + driver.getTitle());

	            // Close the browser
	            driver.quit();
	        } else {
	            System.out.println("Not enough windows open to switch to the 4th window.");
	            // Close the browser
	            driver.quit();
	        }
	    }
	    
	    
	    
	    
	    /* using for loop
	     * 
	     * import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchToFourthWindow {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage that opens multiple windows
        driver.get("https://example.com");

        // Perform an action that opens new windows (e.g., clicking a link)
        // ...

        // Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();

        // Check if there are at least 4 windows open
        if (windowHandles.size() >= 4) {
            // Switch to the 4th window using a for loop
            int targetWindowIndex = 3;  // 4th window, 0-based index
            int currentIndex = 0;

            for (String windowHandle : windowHandles) {
                if (currentIndex == targetWindowIndex) {
                    driver.switchTo().window(windowHandle);

                    // Now you are on the 4th window, and you can perform actions
                    // ...

                    // For example, print the title of the current window
                    System.out.println("Title of the 4th window: " + driver.getTitle());

                    // Close the browser
                    driver.quit();
                    break;  // Exit the loop once the 4th window is found
                }

                currentIndex++;
            }
        } else {
            System.out.println("Not enough windows open to switch to the 4th window.");
            // Close the browser
            driver.quit();
        }
    }
}
*/
	     */
	

	

}
