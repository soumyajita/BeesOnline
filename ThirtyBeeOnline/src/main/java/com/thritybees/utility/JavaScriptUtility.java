package com.thritybees.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility {
	static WebDriver driver;

	public static void scrollDownFully() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}

	/*
	 * JavascriptExecutor js = (JavascriptExecutor) driver;
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // This will
	 * scroll down the page by 1000 pixel vertical
	 * js.executeScript("window.scrollBy(0,1000)");
	 */
	public static void scrollUpFully() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
	}

	public static void scrollUptoElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// "arguments[0]" means first index of page starting at 0
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
