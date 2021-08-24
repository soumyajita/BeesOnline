package com.thirtybees.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.thritybees.base.TestBase;
import com.thritybees.pages.AuthenticationPage;
import com.thritybees.pages.CreateAccountPage;
import com.thritybees.pages.HomePage;


public class AuthenticationTest extends TestBase {
	HomePage hp = null;
	CreateAccountPage account = null;
	AuthenticationPage ap;

	@BeforeSuite
	public void setUp() throws Exception {
		driver = initialization("config.properties");
		hp = new HomePage(driver);
		//account = hp.navigateToCreateAccountPage();
		ap = hp.navigateToAuthenticationPage();
	}


	@Test
	public void validateMsg() {
		Assert.assertTrue(ap.verifyloginboxmsg());
	}


	@Test
	public void validateAfterLoginMsg() {
		Assert.assertTrue(ap.verifyUserSingInCridencial());
	}

	@Test
	public void validateAddingNewAddres() {
		Assert.assertTrue(ap.verifyAddingNewAddress());
	}

	@Test
	public void verifyBlankEmailErrMsg() {
		Assert.assertTrue(ap.validateBlankEmailErrMsg());
	}
	
	@Test
	public void verifyWrongEmailEnter() {
		Assert.assertTrue(ap.validatewrongEmailEnter());
	}
}
