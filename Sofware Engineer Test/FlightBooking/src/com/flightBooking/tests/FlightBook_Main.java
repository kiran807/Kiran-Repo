package com.flightBooking.tests;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.dom4j.DocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import com.flightBooking.tests.FlightBook_TestMethods_Features;


public class FlightBook_Main extends FlightBook_Setup  
{
	
	
	
// Information of Files	
// FlightBook_Setup Java - All Test Annotations - Configurations of startup and Tear down
// FlightBook_Methods_Features Java - All Methods - Application Test Scenario Features 
	

	FlightBook_TestMethods_Features FlightBook_Methods_Features = null;
	
	
	// Constructor of main
	public FlightBook_Main ()
	{
		FlightBook_Methods_Features = new FlightBook_TestMethods_Features ();
		 
	}
	
	 
	// Feature - Select Departure and Destination Option in Page 
		@Test
		public void TC01_BF_Select_DepartAndDestin_Feature()
		{
			FlightBook_Methods_Features.TC01_BF_Select_DepartAndDestin_Feature();
		}
	
	
		// Feature - Select a Flight with Flight N0 in Page 
		@Test
		public void TC02_BF_Select_Flight() 
		{
			FlightBook_Methods_Features.TC02_BF_Select_Flight();

		}


		// Feature - Filling Customer Mandatory Details 
		@Test
		public void TC03_BF_Customer_Mandatory_Details() 
		{
			FlightBook_Methods_Features.TC03_BF_Customer_Mandatory_Details();
		}


		// Feature Customer ID Confirmation 
		@Test
		public void TC04_BF_Customer_ID_Confirmation()
		{
					
			FlightBook_Methods_Features.TC04_BF_Customer_ID_Confirmation();

		}
		
		
}








