package com.thritybees.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.thritybees.utility.LogsUtility;

public class AuthenticationPageObjectRepository extends LogsUtility{
	
	@FindBy(xpath ="//*[@id='login_form']/h3")
	public WebElement subheading;
	
	@FindBy(xpath ="//button[@id='SubmitLogin']")
	public WebElement signinbtn;
	
	@FindBy(xpath="//*[@for='id_gender2']")
	public WebElement selectgender;
	
	@FindBy(id="customer_firstname")
	public WebElement cxFirstName;
	
	@FindBy(id="customer_lastname")
	public WebElement cxLastName;
	
	@FindBy(xpath="//div[@class='help-block']")
	public WebElement wrongpwsenter ;
	
	@FindBy(xpath="//input[@class='is_required validate account_input form-control' and @data-validate='isEmail']")
	public WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement pass ;
	
	@FindBy(xpath = "//p[text()='Welcome to your account. Here you can manage all of your personal information and orders.']")
	public WebElement loginmsg ;
	
	@FindBy(xpath = "//input[@id='firstname']")
	public WebElement firstname ;
	
	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement lastname ;
	
	@FindBy(xpath = "//input[@id='company']")
	public WebElement company ;
	
	@FindBy(xpath = "//input[@id='address1']")
	public WebElement address ;
	
	@FindBy(xpath = "//input[@id='address2']")
	public WebElement addressLane2 ;
	
	@FindBy(xpath = "//input[@id='city']")
	public WebElement city  ;
	
	@FindBy(xpath = "//select[@name='id_state']")
	public WebElement State  ;

	@FindBy(xpath = "//input[@id='postcode']")
	public WebElement  postecode  ;
	
	@FindBy(xpath = "//select[@id='id_country']")
	public WebElement country  ;
	
	@FindBy(xpath = "//input[@id='phone']")
	public WebElement phone  ;
	
	@FindBy(xpath = "//input[@id='phone_mobile']")
	public WebElement mobileNo  ;
	
	@FindBy(xpath = "//textarea[@id='other']")
	public WebElement  additionalInfo ;
	

	@FindBy(xpath = "//input[@id='alias']")
	public WebElement  addressTitle ;
	
	@FindBy(xpath = "//button[@id='submitAddress']")
	public WebElement  savebtn ;
	
	@FindBy(xpath="//span[text()='My addresses']")
	public WebElement  addAddressbtn ;
	
	@FindBy(xpath = "//*[@id='center_column']/div[1]/p[2]")
	public WebElement  suretyNote ;
	
	//*[@id="center_column"]/p
	//*[@id="center_column"]/div[1]/p[2]
	
	
	
	
	
	
}
