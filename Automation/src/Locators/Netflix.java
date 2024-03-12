package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {
	
	public static void main(String[] args) {
		
		// launch the Browser
		WebDriver driver = new ChromeDriver();
							
		// maximize the Window
		driver.manage().window().maximize();
						
		// launch the application
		driver.get("https://www.netflix.com/in/login");
			
				
		//identify the search text field 
		WebElement searchtextfield = driver.findElement(By.id("email"));
				searchtextfield.sendKeys("9763164708");
				
	}			
			
				
}
