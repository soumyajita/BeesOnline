package com.thritybees.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.thritybees.utility.LogsUtility;

public class CoffeeAndTeaPageObjectRepository extends LogsUtility{
	@FindBy(xpath="//select[@id='selectProductSort']")
	public WebElement select;
	
	@FindBy(xpath="//span[@class='price product-price']")
	public List<WebElement>prices;
	

	@FindBy(xpath="//a[@class='product-name']") 
	public List<WebElement>namesOfProduct;
	
	@FindBy(xpath="//h2[@class='page-heading']")
	public WebElement subcategories;
	
}
