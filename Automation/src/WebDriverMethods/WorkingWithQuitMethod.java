package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithQuitMethod {
	public static void main(String[] args) {
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		// to maximize the window
		driver.manage().window().maximize();
		// to launch web Application
		driver.get("https://omayo.blogspot.com/");
			// to click on open a new window
			driver.findElement(By.xpath("newPopup('https://the-internet.herokuapp.com/windows/new');")).click();
		//use quit method
		driver.quit();	
	}

}
