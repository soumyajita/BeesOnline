package com.thritybees.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.thritybees.objectRepository.CreateAccountObjectRepository;
import com.thritybees.utility.ActionUtility;
import com.thritybees.utility.SelectUtility;


public class CreateAccountPage extends CreateAccountObjectRepository {
	WebDriver driver = null;
	ActionUtility actionUtility = ActionUtility.getInstance();
	
	public CreateAccountPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String validateRegistation(){
		actionUtility.sendkeys(email, "sona1224@bee.com");
		System.out.println(actionUtility);
		actionUtility.click(submit);
		actionUtility.click(feMale);
		actionUtility.sendkeys(firstName, "jitaa1");
		actionUtility.sendkeys(lastName, "sekhar1");
		
		actionUtility.sendkeys(password, "1234475");
		SelectUtility.selectByValue(day, "27");
		SelectUtility.selectByIndex(month, 1);
		SelectUtility.selectByValue(year, "2021");
		register.click();
		pageLogs().info("Registeration process is completed");
		String actualRegistrationMsg = actual.getText();
		return actualRegistrationMsg;
	}
	public boolean inValidateRegistation(){
		
		actionUtility.sendkeys(email, "soumyaaaa11@bee.com");
		actionUtility.click(submit);
		actionUtility.click(feMale);
		actionUtility.sendkeys(firstName, "soumya12");
		actionUtility.sendkeys(lastName, "sekhar");
		actionUtility.sendkeys(password, "123445");
		SelectUtility.selectByValue(day, "27");
		SelectUtility.selectByIndex(month, 1);
		SelectUtility.selectByValue(year, "2021");
		register.click();
		String actErrorMsg = invalidRegisteration.getText();
		pageLogs().info("InvalidateRegisteration process due to wrong credential");
		String expErrorMsg ="There is 1 error\r\n" + 
				"firstname is invalid.\r\n" + 
				"« Back";
	
				if(!actErrorMsg.equals(expErrorMsg))
					return true;
				else
					return false;
	}


}
