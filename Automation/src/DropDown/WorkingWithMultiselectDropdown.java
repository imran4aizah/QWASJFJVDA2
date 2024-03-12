package DropDown;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithMultiselectDropdown {
	
	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ADMIN/Downloads/country.html");
		
		WebElement multiselectDropdown = driver.findElement(By.id("DropDown"));
		
	    select s = new select(multiselectDropdown);
	   
	    for(int )			
		}
	}

}
