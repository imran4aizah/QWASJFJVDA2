package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetPageSourceMethod {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// to maximize the browser
		driver.manage().window().maximize();
		// to launch the web application
		driver.get("https://www.amazon.com");
		// to fetch the source code
		String source = driver.getPageSource();
		System.out.println(source);
		
	}

}
