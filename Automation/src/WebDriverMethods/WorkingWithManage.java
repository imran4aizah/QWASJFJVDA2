package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithManage {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//to manage
		driver.manage().window().maximize();
		
		
	}

}
