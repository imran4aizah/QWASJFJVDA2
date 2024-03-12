package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbRegistrationPage {
	
	
	public static void main(String[] args) {
		
		// to launch the browser
		WebDriver driver=new ChromeDriver();
		
		// to maximize the windows
	     driver.manage().window().maximize();
		
		//launch the web application
		driver.get("https://www.facebook.com/");
		
	    // click on create new account
		driver.findElement(By.linkText("Create new account")).click();

		WebElement element = driver.findElement(By.tagName("firstname"));
		element.sendKeys("Imran");
		WebElement element1 = driver.findElement(By.tagName("surname"));
		element1.sendKeys("Khan");
		
		
		
		}
	

}
