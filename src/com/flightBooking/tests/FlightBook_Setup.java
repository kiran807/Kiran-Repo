package com.flightBooking.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FlightBook_Setup {
	
	static WebDriver driver;
	
 
		@BeforeSuite
		public void BeforeSuite()
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\automation\\chromedriver.exe");
		 	 driver = new ChromeDriver();
		 	System.out.println("*****************Before Suite method passed***********************");
		 	
		}
		
		@AfterSuite
		public void AfterSuite()
		
		{
			driver.quit();
			System.out.println("**********************After Suite method passed************************");
		}
		
		
		@BeforeMethod
		public void BeforeMethod()
		{
			
		 	// Pre-Conditions
			
		 	// Open Website URL
				driver.get("https://blazedemo.com/");
				
				// Maxmize Browser Window
				driver.manage().window().maximize();
				
				// Manage implicit Waits
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				// Delete Cookies
				driver.manage().deleteAllCookies();
			
				System.out.println("****************Before Method - Rreconditions passed****************");
		}
		
		
		@AfterMethod
		public void AfterMethod()
		{
			System.out.println("********************After Method is Executed**********************");
			
		}


}
