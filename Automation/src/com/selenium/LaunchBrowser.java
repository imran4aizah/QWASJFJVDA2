package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		
		// to launch the browser
	
		WebDriver driver = new ChromeDriver();
		
		//launch the Web Application
		
				driver.get("https:www.flipkart.com/");
				
		//actual title
				
			String actual_title = driver.getTitle();
			
		//Expected title
			
			String expected_title = ("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
			
			//Verifying the title
			if(actual_title.equals(expected_title))
			{
				System.out.println("Test Case Is Pass");
				
			}else {
				System.out.println("Test Case Is Fail");
			}
				
		}
}
