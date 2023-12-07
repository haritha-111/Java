import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking Browser
		
		//ChromeDriver - Methods - Close get
		//safari 
		//Firefox
		//webdriver close get
		//Webdriver methods + class methods
		//Chromedriver .exe -> chrome browser
		
	//steps to invoke crome driver
		//Slenium manager 
		System.setProperty("WebDriver.chrome.driver", "/Users/uday2/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Firefox Launch
		//geckodriver 
		
		//WebDriver.gecko.driver
		System.setProperty("WebDriver.gecko.driver", "/Users/uday2/OneDrive/Documents/geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();

		
		//Microsoft Edge
		System.setProperty("WebDriver.edge.driver", "/Users/uday2/OneDrive/Documents/msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
		 driver.get("https://rahulshettyacademy.com/");
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 driver.close();
		 driver.quit();
		 

		 
		

	}

}
