package com.thirtybees.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import com.thritybees.extentreports.ExtentReportV4;
import com.thritybees.pages.HomePage;
import com.thritybees.pages.CoffeeAndTeaPage;

public class CoffeeAndTeaTest extends ExtentReportV4 {
	WebDriver driver = null;
	HomePage hp = null;
	CoffeeAndTeaPage product = null;
		
		@BeforeSuite
		public void setUp() throws Exception{
		driver = initialization("config.properties");	
		hp = new HomePage(driver);
		product = hp.navigateToCoffeeAndTeaPage();
		}
		
		@AfterSuite
		public void tearDown(){
			driver.quit();
		}
		@Test	
		public void priceSortDropDownList(){
			try {
				testLogs().info("price dropdown list");
				passTest("--product sort--");
				Assert.assertTrue(product.productSortDropDown());
			} catch (Exception e) {
				testLogs().info("product sort according to drop down");
				e.printStackTrace();
			}
			
		}
		
}
