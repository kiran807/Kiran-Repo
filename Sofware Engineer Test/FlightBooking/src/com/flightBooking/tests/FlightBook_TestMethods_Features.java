package com.flightBooking.tests;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class FlightBook_TestMethods_Features extends FlightBook_Setup {
	
	
	// Feature - Select Departure and Destination Option in Page 
	
	public void TC01_BF_Select_DepartAndDestin_Feature()
	
	{
	
		
		//Select Departure = new Select(driver.findElement(By.name("Depart")));
		// Select Departure = new Select (driver.findElement(By.name(System.getProperty("Depart"))));
		
		Select Departure = new Select ( driver.findElement(By.name("fromPort")));
		Departure.selectByValue("Boston");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		//Select Destination = new Select (driver.findElement(By.name("Destin")));
		//Select Destination = new Select (driver.findElement(By.name(System.getProperty("Destin"))));
		
		Select Destination = new Select ( driver.findElement(By.name("toPort")));
		Destination.selectByValue("London");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath(("FindFlights"))).click();
		//driver.findElement(By.xpath(System.getProperty("FindFlights"))).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		System.out.println("Feature - Select Departure and Destination Option in Page");
		}
		
		
	
	
	// Feature - Select a Flight with Flight N0 23 in Page 
	public void TC02_BF_Select_Flight() 
	{
		
		// Retrieve No Of Columns in Table
		  List<WebElement> FlightSelectionTableColumn = driver.findElements(By.xpath("//div[@class='container']/table/thead/tr/th"));
		 	  System.out.println("Table No Of Columns : "+FlightSelectionTableColumn.size());
		 
		 // Retrieve No Of Row in Table
		List<WebElement> FlightSelectionTableRow = driver.findElements(By.xpath("//div[@class='container']/table/tbody/tr"));
		System.out.println("Table No Of Rows : "+FlightSelectionTableRow.size());
		
		// Selecting a Flight by Flight Number
		driver.findElement(By.xpath("//div[@class='container']/table/tbody/tr/td[text()='43']/preceding-sibling::td/input")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		System.out.println("Feature - Select a Flight with Flight N0 in Page");
		}
	
	
	
	
	// Feature - Filling Customer Mandatory Details 
	public void TC03_BF_Customer_Mandatory_Details() {
		
		
		driver.findElement(By.id("inputName")).sendKeys("Frank");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		System.out.println(" Feature - Filling Customer Mandatory Details ");
	}
	
	
	
	// Feature Customer ID Confirmation
	public void TC04_BF_Customer_ID_Confirmation() {
		
		
		if (driver.findElement(By.xpath("//table[@class='table']/tbody/tr/td[2]")).isDisplayed())
		{
		String ID = driver.findElement(By.xpath("//table[@class='table']/tbody/tr/td[2]")).getText();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		System.out.println(ID);
		} else
		{
			System.out.println("Customer ID is Not Confirmed");
		}
	
		System.out.println("Feature Customer ID Confirmation");
	}
	
}
