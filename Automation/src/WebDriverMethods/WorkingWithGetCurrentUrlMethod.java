package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetCurrentUrlMethod
{
	public static void main(String[] args) {
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		// to maximize the browser
		driver.manage().window().maximize();
		
		// to launch the web application
		driver.get("IRCTC Next Generation eTicketing System");
	    //to fetch the URL
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "IRCTC Next Generation eTicketing System";
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("Url is Correct");
		}
		else {
			System.out.println("Url is Wrong");
		}
		
	}

}
