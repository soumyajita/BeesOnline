package com.thritybees.utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtility {
	static WebDriver driver;
	public static void waitForElement(WebElement element, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void elementToBeClickable(WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void alertIsPresent(WebElement element, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	/*public static void fluentWait(WebElement element, long time) {
		FluentWait wait = new FluentWait(driver).withTimeout(time, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class).pollingEvery(4, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOf(element));
	}*/

}
