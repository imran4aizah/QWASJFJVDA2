package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithidMethod {
	
	public static void main(String[] args) {
		
		// launch the Browser
		WebDriver driver = new ChromeDriver();
			
		// maximize the Window
		driver.manage().window().maximize();
		
		// launch the application
		driver.get("https://demowebshop.tricentis.com/");
		
		//identify the search textfield
		WebElement searchtextfield = driver.findElement(By.id("small-searchterms"));
		
		searchtextfield.sendKeys("books");
		
	}

}
