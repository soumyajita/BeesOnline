package com.thritybees.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.thritybees.objectRepository.CoffeeAndTeaPageObjectRepository;
import com.thritybees.utility.ActionUtility;
import com.thritybees.utility.ExcelUtility;
import com.thritybees.utility.SelectUtility;

public class CoffeeAndTeaPage extends CoffeeAndTeaPageObjectRepository {
	WebDriver driver = null;
	ActionUtility actionUtility = ActionUtility.getInstance();

	public CoffeeAndTeaPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean productSortDropDown()  {
		ArrayList<String> actualProductData = new ArrayList<String>();
		Select sel = new Select(select);
		pageLogs().info("Getting Select product");
		List<WebElement> list = sel.getOptions();
		for (WebElement element : list) {
			String data = element.getText();
			actualProductData.add(data);
			pageLogs().info("actualProductData" + actualProductData);
		}

		List<String> expProductData = ExcelUtility.getColumnData("TestDataBees.xlsx", "sortBy", 0);

		if (actualProductData.equals(expProductData))
			return true;
		else
			return false;
	}

	
}
