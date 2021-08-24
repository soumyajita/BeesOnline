package com.thritybees.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.thritybees.utility.LogsUtility;

public class HomePageObjectREpository extends LogsUtility{

	@FindBy(xpath = "//img[@title='BEE']")
	public WebElement logo;

	@FindBy(id = "search_query_top")
	public WebElement search;

	@FindBy(xpath = "//button[@name='submit_search']")
	public WebElement searchsymbol;

	@FindBy(xpath = "//div[@class='alert alert-warning']")
	public WebElement searchNotFoundMsg;

	@FindBy(xpath = "//a[@class='login']")
	public WebElement signIn;
	
	@FindBy(xpath = "//b[text()='My Cart']")
	public WebElement emptyCartMsg;

	@FindBy(xpath = "//div[@class='alert alert-warning']")
	public WebElement actualCartMsg;
	
	@FindBy(xpath = "//a[@title='Coffee and Tea']")
	public WebElement coffeeAndTea;
	
	@FindBy(xpath="//h3[@class='subcategory-title text-center']//following::a[text()='Tea']")
	public WebElement Tea;
	
	@FindBy(xpath="//a[@class='login']")
	public WebElement signinBtn;
	
	@FindBy(xpath="//*[@id='homefeatured']/li[4]/article/div/div[2]/h3/a")
	public WebElement tinCupPdt;
}
