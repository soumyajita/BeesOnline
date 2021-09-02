package com.thritybees.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.thritybees.utility.LogsUtility;



public class CreateAccountObjectRepository extends LogsUtility{
	@FindBy(xpath="//a[@class='login']")
	public WebElement signIn;
	
	
	@FindBy(xpath="//input[@id='email_create']")
	public WebElement email;
	
	@FindBy(id ="SubmitCreate")
	public WebElement submit;
	
	@FindBy(xpath="//label[2]/span")
	public WebElement feMale;
	
	
	@FindBy(id="customer_firstname")
	public WebElement firstName;
	
	@FindBy(id="customer_lastname")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	
	@FindBy(id="days")
	public WebElement day;
	
	@FindBy(id="months")
	public WebElement month;
	
	@FindBy(id="years")
	public WebElement year;
	
	@FindBy(id="submitAccount")
	public WebElement register;
	@FindBy(xpath="//div[@class='alert alert-success']")
	public WebElement actual;
	
	@FindBy(xpath="//div[@class='alert alert-danger']")
	public WebElement invalidRegisteration;
	
	



	@FindBy(id = "SubmitLogin")
	public WebElement signInBtn;

	@FindBy(xpath = "//a[text()='Forgot your password?']")
	public WebElement forgotPwd;



	
}
