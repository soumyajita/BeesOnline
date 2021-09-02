package com.thirtybees.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.thritybees.extentreports.ExtentReportV4;
import com.thritybees.pages.CreateAccountPage;
import com.thritybees.pages.HomePage;

public class CreateAccountTest extends ExtentReportV4 {
	WebDriver driver = null;
	HomePage hp = null;
	CreateAccountPage account = null;

	@BeforeSuite
	public void setUp() {
		try {
			driver = initialization("config.properties");
			hp = new HomePage(driver);
			account = hp.navigateToCreateAccountPage();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void verifyRegistration() {
		try {
			passTest("--Registration Complete--");
			Assert.assertEquals(account.validateRegistation(), "Your account has been created.");
			testLogs().info("--Registration complete--");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Test
	public void verifyInValidRegistration() {
		passTest("--Registration is not Completed--");
		testLogs().info("--Registration is not completed--");
		Assert.assertTrue(account.inValidateRegistation());
	}




}
