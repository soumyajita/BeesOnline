package com.thirtybees.test;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.thritybees.base.TestBase;
import com.thritybees.pages.HomePage;

public class HomeTest extends TestBase{
	HomePage hp = null;
	
	@BeforeMethod
	public void setUp() throws Exception{
	driver=initialization("config.properties");	
	hp=new HomePage(driver);
	}
	
	@Test
	public void verifyLogo() {
		testLogs().info("Logo is displayed..");
		Assert.assertTrue(hp.verifyLogoDisplay(),"image is displayed as expected");
	}
	
	@Test
	public void searchByValidProductGetTitle(){
		testLogs().info("Search valid product displayed..");
		Assert.assertTrue(hp.verifySearchTitleAfterValidSearch());
	}
	
	@Test
	public void searchInValidProduct() {
		String expectedMsg="No results were found for your search \"book$@\"";
		String actualMsg = hp.invalidProductInSearch();
		testLogs().info("");
		Assert.assertEquals(actualMsg, expectedMsg);
	}
	@Test
	public void verifyTitle(){
		testLogs().info("");
		Assert.assertEquals(driver.getTitle(), "BEE");
	}
	@Test
	public void validateEmptyCartList() {
		testLogs().info("");
		Assert.assertEquals(hp.verifyEmptyShoppingCart(), "Your shopping cart is empty.");
	}
	

}
