package com.thritybees.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.thritybees.objectRepository.HomePageObjectREpository;
import com.thritybees.utility.ActionUtility;



public class HomePage extends HomePageObjectREpository {
	public WebDriver driver = null;
	ActionUtility actionUtility = ActionUtility.getInstance();
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public boolean verifyLogoDisplay() {
		if (logo != null) {
			System.out.println("Image is diasplayed");
			return true;
		} else
			return false;
	}

	public boolean verifySearchTitleAfterValidSearch() {
		actionUtility.sendkeys(search, "Candle");
		actionUtility.click(searchsymbol);
		String actual = actionUtility.getTitle(driver);
		String expected = "Search - BEE";
		if (actual.equals(expected))
			return true;
		else
			return false;
	}

	public String invalidProductInSearch() {
		String searchProduct = "book$@";
		actionUtility.sendkeys(search, searchProduct);
		actionUtility.click(searchsymbol);
		String actual = searchNotFoundMsg.getText();

		String expected = " No results were found for your search \"book$@\"";

		if (actual.equals(expected)) {
			pageLogs().info(actual + "   Actual" + "   " + expected);
		}
		return actual;

	}
	
	
	public String verifyEmptyShoppingCart() {
		actionUtility.click(emptyCartMsg);
		String cartMsg = actualCartMsg.getText();
		pageLogs().info("cartMsg" +cartMsg);
		if (cartMsg.contains("Your shopping cart is empty.")) {
	        driver.navigate().back();
        }
		return cartMsg;
	} 
    
  
    
	public String verifytitle() {
		String Expected = "BEE";
		return Expected;
	}
	
	public String verifyProduct() {
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		WebElement flag = tinCupPdt;
		js.executeScript("arguments[0].scrollIntoView();", flag);
		return null;
		
	}
	
	public CoffeeAndTeaPage navigateToCoffeeAndTeaPage() {
		actionUtility.click(coffeeAndTea);
		pageLogs().info("navigate to CoffeeAndTeaPage");
		return new CoffeeAndTeaPage(driver);
	}
	public CreateAccountPage navigateToCreateAccountPage() {
		actionUtility.click(signIn);
		pageLogs().info("navigate to CreateAccountPage");
		return new CreateAccountPage(driver);
	}

	
	public AuthenticationPage navigateToAuthenticationPage (){
		actionUtility.click(signIn);
		pageLogs().info("navigate to Registration Page");
		return new AuthenticationPage(driver);
	}



}
