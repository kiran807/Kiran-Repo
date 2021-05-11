package com.flightBooking.tests;

import java.util.concurrent.TimeUnit;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FlightBook_Setup  {
	
	
	static WebDriver driver;


 
		@BeforeSuite
		public void BeforeSuite() throws IOException, DocumentException
		{
			
			
			// Create WebDriver instance for Chrome Browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\automation\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-dev-shm-usage");
		 	 driver = new ChromeDriver();
		 	 
		 	
		 	 // Open Website URL
				driver.get("https://blazedemo.com/");
				
				// Maximize Browser Window
				driver.manage().window().maximize();
				
				// Delete Cookies
				driver.manage().deleteAllCookies();
				
			/*
				// Load the Properties File 
				Properties obj = new Properties();
				FileInputStream objfile = new FileInputStream(System.getProperty("C:\\Users\\user\\eclipse-workspace\\FlightBooking\\src\\com\\FlightBook\\ObjectRepository\\application.properties"));
				obj.load(objfile);
				
			// load XML	
		File InputFile = new File(System.getProperty("C:\\Users\\user\\eclipse-workspace\\FlightBooking\\src\\com\\FlightBook\\ObjectRepository")+"\\propertiesxml.xml");
	SAXReader saxReader = new SAXReader();
	Document doc = saxReader.read(InputFile);
	String Depart = doc.selectSingleNode("//menu/Depart").getText();
	String Destin = doc.selectSingleNode("//menu/Depart").getText();
	String FindFlights = doc.selectSingleNode("//menu/Depart").getText();

				*/
			
			
		 	System.out.println("***************** Before Suite method passed ***********************");
		 	
		}
		
		@AfterSuite
		public void AfterSuite()
		
		{
			driver.quit();
			System.out.println("********************** After Suite method passed  ************************");
		}
		
		
		@BeforeMethod
		public void BeforeMethod()
		{

			// Manage implicit Waits
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
				System.out.println("**************** Before Method **************************");  
		}
		
		
		@AfterMethod
		public void AfterMethod()
		{
			System.out.println("******************** After Method is Executed **********************");
			
		}


}
