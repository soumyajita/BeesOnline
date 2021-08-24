package com.thritybees.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.thritybees.objectRepository.AuthenticationPageObjectRepository;
import com.thritybees.utility.ActionUtility;
import com.thritybees.utility.SelectUtility;



public class AuthenticationPage extends AuthenticationPageObjectRepository {

	WebDriver driver;
	
	ActionUtility actionUtility = ActionUtility.getInstance();
	public AuthenticationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean verifyloginboxmsg() {
		String actual = subheading.getText();
		System.out.println("{" + actual);
		String expected = "ALREADY REGISTERED?";
		if (actual.equals(expected)) {
			System.out.println("msg is match");
			return true;
		} else {
			System.out.println("msg is not match");
			return false;
		}
	}


	
	public boolean validatewrongEmailEnter() {
		actionUtility.sendkeys(email, "");
		actionUtility.sendkeys(pass,"welcome@123123" );
		signinbtn.click();
		
		String actual = wrongpwsenter.getText();
		pageLogs().info("actual" +actual);
		pageLogs().info("--wrong password entered--");
		
		String expected = "(Five characters minimum)";
		if (actual.equals(expected)) {
			pageLogs().info("--Msg is match--");
			System.out.println("Msg is match");
			return true;
		} else {
			pageLogs().info("--Msg is not matched--");
			return false;
		}
	}

	public boolean verifyUserSingInCridencial() {
		actionUtility.sendkeys(email, "testuser@bee.com");
		actionUtility.sendkeys(pass, "welcome@123123");
		actionUtility.click(signinbtn);
		
		String expected = "Welcome to your account. Here you can manage all of your personal information and orders.";
		String actual = loginmsg.getText();

		if (expected.equals(actual)) {
			pageLogs().info("msg is match");
			return true;
		} else {
			pageLogs().info("msg is not match");
			return false;
		}
	}
	public boolean verifyAddingNewAddress() {
		actionUtility.sendkeys(email, "testuser@bee.com");
		actionUtility.sendkeys(pass, "welcome@123123");
		actionUtility.click(signinbtn);
		actionUtility.click(addAddressbtn);
		actionUtility.sendkeys(firstname, "aabc");
		actionUtility.sendkeys(lastname, "aaa");
		actionUtility.sendkeys(company, "wiprooo");
		actionUtility.sendkeys(address, "Beaker street");
		actionUtility.sendkeys(addressLane2, "amsterdam");
		actionUtility.sendkeys(city, "Hawai");
		SelectUtility.selectByText(State, "California");
		actionUtility.sendkeys(postecode, "93624");
		SelectUtility.selectByValue(country, "21");
		actionUtility.sendkeys(phone, "25468321");
		actionUtility.sendkeys(mobileNo, "59862147351");
		actionUtility.sendkeys(addressTitle, "home");
		savebtn.click();
		String actual = suretyNote.getText();
		String expected = "Be sure to update your personal information if it has changed.";
		if (expected.equals(actual)) {
			System.out.println("msg is match");
			return true;
		} else {
			System.out.println("msg is not match");
			return false;
		}
	}

	public boolean validateBlankEmailErrMsg() {
		actionUtility.click(signinbtn);
		String validationmsg = email.getAttribute("validationMessage");
		 System.out.println(validationmsg);
		String expErrorMsg = "Please fill out this field.";
		if (validationmsg.equals(expErrorMsg)) {
			System.out.println("blank username msg match");
			return true;
		} else {
			System.out.println("blank username msg not match");
			return false;
		}

	}

}
