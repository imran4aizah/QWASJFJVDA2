package SearchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindElements {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//search ipad in flipkart
		driver.findElement(By.name("q")).sendKeys("ipad",Keys.ENTER);
		
		List<WebElement> ipadName = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		//identify all ipad price
		List<WebElement> ipadName1 = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		//for each loop
//		for(WebElement name:ipadName)
//		{
//			System.out.println(name.getText());
//		}
		
		//for loop
		for(int i=0;i<ipadName1.size();i++); {
			int i = 0;
			System.out.println(ipadName1.get(i).getText());
			//_30jeq3 _1_WHN1
		}
		
	}

}
