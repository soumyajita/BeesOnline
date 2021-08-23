package com.thritybees.utility;



import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertUtility {
	

	static WebDriver driver;
	private static AlertUtility instance;
	public static AlertUtility getInstance() {
		if(instance == null) {
			instance = new AlertUtility();
		}
		
		return instance;
	}

	public  void simpleAlertHandle() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert simpleAlert = driver.switchTo().alert();
			simpleAlert.accept();
			System.out.println("alert accepted");
		} catch (Exception e) {
			System.out.println("unexpected alert not present");
		}
	}

	
}
