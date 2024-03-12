package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSearchJeans {
	
	public static void main(String[] args) throws InterruptedException {
		
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Jeans",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='common-customRadio gender-label undefined']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Roadster']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='colour-label colour-colorDisplay'[1]]")).click();
		
		
		//label[@class='common-customRadio gender-label'][1]
		
	}

}
