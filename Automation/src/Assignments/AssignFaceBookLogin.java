package Assignments;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignFaceBookLogin {

public static void main(String[] args) {
		
		// launch the Browser
		WebDriver driver = new ChromeDriver();
					
		// maximize the Window
		driver.manage().window().maximize();
				
		// launch the application
		driver.get("https://www.facebook.com/login/");
	
		
		//identify the search text field 
		WebElement searchtextfield = driver.findElement(By.id("email"));
		searchtextfield.sendKeys("imrangosi@gmail.com");
		
		WebElement stf = driver.findElement(By.name("pass"));
		stf.sendKeys("Rehan4Aizah@");
		
	// identify the search button & click on that particular button
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();

}
}
