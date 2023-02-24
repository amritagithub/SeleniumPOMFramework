package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase{
//Constructor
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
//Elements

	@FindBy(xpath="//*[@class=\"page-title\"]") WebElement pageTitle;
//Action methods
	
	public String getPageTitle()
	{
		return (pageTitle.getText());
	}
	
	
}
