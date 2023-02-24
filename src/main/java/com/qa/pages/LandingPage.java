package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LandingPage extends TestBase {

	//Page factory By
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/a") WebElement signInButton;
	@FindBy(xpath="/html/body/div[2]/header/div[2]/a") WebElement logo;
	// Create constructor
	public LandingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Create action methods
	public SignInPage clickOnSignInButton()
	{
		signInButton.click();
		return (new SignInPage());
	}
	public boolean isLogoVisible()
	{
		return logo.isDisplayed();
	}
}
