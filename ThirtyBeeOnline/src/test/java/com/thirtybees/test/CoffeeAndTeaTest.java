package com.thirtybees.test;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.thritybees.base.TestBase;
import com.thritybees.pages.HomePage;
import com.thritybees.pages.CoffeeAndTeaPage;

public class CoffeeAndTeaTest extends TestBase{
	HomePage hp = null;
	CoffeeAndTeaPage product = null;
		
		@BeforeSuite
		public void setUp() throws Exception{
		driver = initialization("config.properties");	
		hp = new HomePage(driver);
		product = hp.navigateToCoffeeAndTeaPage();
		}
		
		/*@AfterSuite
		public void tearDown(){
			driver.quit();
		}*/
		@Test	
		public void priceSortDropDownList(){
			try {
				testLogs().info("");
				Assert.assertTrue(product.productSortDropDown());
			} catch (Exception e) {
				testLogs().info("");
				e.printStackTrace();
			}
			
		}
		
}
