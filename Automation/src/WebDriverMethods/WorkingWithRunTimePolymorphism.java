package WebDriverMethods;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithRunTimePolymorphism {
	
	static WebDriver driver;
	public static void main(String[] args) {
		while(true) {
			
			Scanner scr = new Scanner(System.in);
			System.out.println("==Enter your browser name==");
			String browser = scr.next();
			
			if(browser.equals("Chrome")) {
				driver = new ChromeDriver();
			}
			else if(browser.equals("firefox")) {
				driver = new FirefoxDriver();
			}
			else if(browser.equals("edge")) {
				driver = new EdgeDriver();
				}
			else {
				System.out.println("Invalid Browser");
			}
			
		}
		
	}

}
