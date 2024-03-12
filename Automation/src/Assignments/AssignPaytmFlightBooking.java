package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignPaytmFlightBooking {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://paytm.com/");
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//div[2][@class=\"_2EGQY\"]")).click();
		
	}

}
