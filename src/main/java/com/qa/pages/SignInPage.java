package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class SignInPage extends TestBase {
	
	//Page factory By
	@FindBy(id="email") WebElement username;
	@FindBy(id="pass") WebElement password;
	@FindBy(id="send2") WebElement signInButton;
	
	// Constructor
	public SignInPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Perform actions
	public HomePage SignIn(String UserName, String Password) {
		
		username.sendKeys(UserName);
		password.sendKeys(Password);
		signInButton.click();
		return (new HomePage());
		
	}
}
