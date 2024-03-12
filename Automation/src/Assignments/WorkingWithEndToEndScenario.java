package Assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithEndToEndScenario {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("imrangosi@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("imran@1687",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='top-menu']/descendant::a[@href='/books']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Shopping cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='4067878']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("termsofservice")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();	
	}
}
