import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//implicit wait - wait atleast 5sec or 10 secs
		System.setProperty("WebDriver.chrome.driver", "/Users/uday2/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicet waits are something(obejcts) to show on page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		//css selector
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//linktext selector  
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Transition of screen takes sometime to select element properly,so used the sleep method & pause for 2 secs
		Thread.sleep(2000);
		//xpath selector
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		
		//Unique attributes are not there, then using index value for xpath selector 
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		//Unique attributes are not there, then using index value for css selector 
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

		//unique attributes not there, then using TAGs for xpath  //ParentTag/Child Tag
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("3106982093");
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		
		//unique attributes not there, then using TAGs for css   ParentTag Child Tag
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());

		
		//Customised xpath, Child traverese, & indexing is the Best practice Syntax to find webelement
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		Thread.sleep(2000);

		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

		//When ATTRIBUTE VALUES changing dynalically then tagname[Attribute*='value']
		driver.findElement(By.cssSelector("input[Type*='pass']")).sendKeys("rahulshettyacademy");


		driver.findElement(By.className("submit")).click();
		
		//driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		//when the above ATTIBUTe VALUE, if you feel its keep on chaging dynamically then using xpath
		//driver.findElement(By.xpath("//button[contains(@class='submit')]")).click();
		
		

		
	}

}
