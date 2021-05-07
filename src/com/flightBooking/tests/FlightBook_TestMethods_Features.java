package com.flightBooking.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class FlightBook_TestMethods_Features extends FlightBook_Setup {

	
	
	// Feature - Select Departure and Destination Option in Page 
	
	public void TC01_BF_Select_DepartAndDestin_Feature()
	{
		System.out.println("*****Feature - Select Departure and Destination Option in Page*******");
		
	
		
		Select Departure = new Select ( driver.findElement(By.name("fromPort")));
		Departure.selectByValue("Boston");
		
		Select Destination = new Select ( driver.findElement(By.name("toPort")));
		Destination.selectByValue("London");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		//driver.manage().timeouts().pageLoadTimeout(1000,
		
	
	}
	
	
	public void TC02_BF_Select_Flight() throws InterruptedException
	{
		
		/*WebElement chk = driver.findElement(By.xpath("//div[@class='container']/table/thead/tr[1]/th[2]"));
		 chk.getText();
		 System.out.println("test is "+chk);
		 */
		
//		  List<WebElement> FlightSelectionTableColumn = driver.findElements(By.xpath("//div[@class='container']/table/thead/tr[1]/th[1]"));
//		  
//		  System.out.println("No Of Columns : "+FlightSelectionTableColumn.size());
//		
//		List<WebElement> FlightSelectionTableRow = driver.findElements(By.xpath("//div[@class='container']/table/tbody/tr[2]/td[text()='43']"));
//		System.out.println("No Of Columns : "+FlightSelectionTableRow.size());
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='container']/table/tbody/tr/td[text()='43']/preceding-sibling::td/input")).click();

		}
}
