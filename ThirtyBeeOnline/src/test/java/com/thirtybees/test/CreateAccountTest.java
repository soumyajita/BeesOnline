package com.thirtybees.test;


import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.thritybees.base.TestBase;
import com.thritybees.pages.CreateAccountPage;
import com.thritybees.pages.HomePage;


public class CreateAccountTest extends TestBase {
	HomePage hp = null;
	CreateAccountPage account = null;

	@BeforeSuite
	public void setUp() throws Exception {
		driver = initialization("config.properties");
		hp = new HomePage(driver);
		account = hp.navigateToCreateAccountPage();
	}

	@Test
	public void verifyRegistation() {
		try {
			Assert.assertEquals(account.validateRegistation(), "Your account has been created.");
		} catch (Exception e) {
			testLogs().info("--verifyRegistation completed--");
			e.printStackTrace();
		}
	}

	@Test
	public void verifyInValidRegistration() {
		testLogs().info("");
		Assert.assertTrue(account.inValidateRegistation());
	}

}
