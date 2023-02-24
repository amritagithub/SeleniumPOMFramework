package com.qa.tests;

import static com.qa.base.TestBase.prop;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LandingPage;
import com.qa.pages.SignInPage;
import com.qa.util.ExtentTestManager;

public class SignInPageTest extends TestBase{
	LandingPage landingPage;
	SignInPage signInPage;
	HomePage homePage;
	//Call super constructor
	public SignInPageTest()
	{
		super();
	}
	
	// Create page class object
	@BeforeMethod()
	public void setUp()
	{
		init();
		landingPage =new LandingPage();
		signInPage=new SignInPage();
		signInPage=landingPage.clickOnSignInButton();
		
	}
	
	@Test
	public void signInToTheApplication()
	{//ExtentTestManager.getTest().log(Status.INFO, "Sign in to the application");
		homePage=signInPage.SignIn(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod()
	public void TearDown()
	{
		driver.quit();
	}
	
	
	
}
