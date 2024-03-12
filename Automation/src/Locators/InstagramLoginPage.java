package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/");
			
	 WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("9763164708");
	 
	 WebElement password = driver.findElement(By.name("password"));
	 password.sendKeys("Imran@16");
	 
	 
		
}
}