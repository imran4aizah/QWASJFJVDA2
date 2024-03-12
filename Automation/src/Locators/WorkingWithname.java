package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithname {
	
	public static void main(String[] args) {
		
		// launch the Browser
		WebDriver driver = new ChromeDriver();
					
		// maximize the Window
		driver.manage().window().maximize();
				
		// launch the application
		driver.get("https://www.flipkart.com/"); 
		
		//identify the search textfield 
		WebElement stf = driver.findElement(By.name("q"));
		stf.sendKeys("Laptop");
				
	}

}
