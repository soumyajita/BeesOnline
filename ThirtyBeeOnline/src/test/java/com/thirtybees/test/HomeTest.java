package com.thirtybees.test;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.thritybees.extentreports.ExtentReportV4;
import com.thritybees.pages.HomePage;

public class HomeTest extends ExtentReportV4 {
	HomePage hp = null;

	@BeforeMethod
	public void setUp() throws Exception {
		driver = initialization("config.properties");
		hp = new HomePage(driver);
	}

	@Test
	public void verifyLogo() {
		passTest("--verifyLogoDisplay--");
		testLogs().info("Logo is displayed..");
		Assert.assertTrue(hp.verifyLogoDisplay(), "image is displayed as expected");
	}

	@Test
	public void searchByValidProductGetTitle() {
		passTest("--Search valid product displayed--");
		testLogs().info("Search valid product displayed..");
		Assert.assertTrue(hp.verifySearchTitleAfterValidSearch());
	}

	@Test
	public void searchInValidProduct() {
		String expectedMsg = "No results were found for your search \"book$@\"";
		String actualMsg = hp.invalidProductInSearch();
		passTest("--Search Invalid product displayed--");
		testLogs().info("No result found for invalid product displayed..");
		Assert.assertEquals(actualMsg, expectedMsg);
	}

	@Test
	public void verifyTitle() {
		testLogs().info("verify title of page");
		Assert.assertEquals(driver.getTitle(), "BEE");
	}

	@Test
	public void validateEmptyCartList() {
		passTest("--validate empty cart list before login--");
		testLogs().info("validate empty cart list before login");
		Assert.assertEquals(hp.verifyEmptyShoppingCart(), "Your shopping cart is empty.");
	}
	

}
