package com.thirtybees.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



import com.thritybees.extentreports.ExtentReportV4;
import com.thritybees.pages.AuthenticationPage;
import com.thritybees.pages.CreateAccountPage;
import com.thritybees.pages.HomePage;


public class AuthenticationTest extends ExtentReportV4  {
	WebDriver driver = null;
	HomePage hp = null;
	CreateAccountPage account = null;
	AuthenticationPage ap;
	
	@BeforeSuite
	public void setUp() {
		try {
			driver = initialization("config.properties");
			hp = new HomePage(driver);
			ap = hp.navigateToAuthenticationPage();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}


	@Test
	public void validateMsg() {
		testLogs().info("validate msg from login box");
		Assert.assertTrue(ap.verifyloginboxmsg());
	}


	@Test
	public void validateAfterLoginMsg() {
		testLogs().info("validate After LoginMsg");
		passTest("login with correct credential");
		Assert.assertTrue(ap.verifyUserSingInCridencial());
	}

	@Test
	public void validateAddingNewAddres() {
		testLogs().info("validate adding new address");
		Assert.assertTrue(ap.verifyAddingNewAddress());
	}

	@Test
	public void verifyBlankEmailErrMsg() {
		testLogs().info("validate After LoginMsg");
		passTest("blank msg check");
		Assert.assertTrue(ap.validateBlankEmailErrMsg());
	}
	
	@Test
	public void verifyWrongEmailEnter() {
		Assert.assertTrue(ap.validatewrongEmailEnter());
	}
}
