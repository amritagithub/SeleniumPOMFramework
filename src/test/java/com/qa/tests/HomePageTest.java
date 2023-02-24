package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LandingPage;
import com.qa.pages.SignInPage;
import com.qa.util.ExtentTestManager;

public class HomePageTest extends TestBase{
// call super in constructor
	public HomePageTest()
	{
		super();
	}
	
	// Create page class object
	LandingPage landingPage;
	SignInPage signInPage;
	HomePage homePage;
	
	@BeforeMethod()
	public void setUp()
	{
		init();
		landingPage =new LandingPage();
		signInPage=new SignInPage();
		signInPage=landingPage.clickOnSignInButton();
		homePage=signInPage.SignIn(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void verifyTitle()
	{
		//ExtentTestManager.getTest().log(Status.INFO, "Verify hoomepage Title");
		Assert.assertEquals(homePage.getPageTitle(),"My Account","Title do not match");
		
	}
	
	@AfterMethod()
	public void TearDown()
	{
		driver.quit();
	}
	
	
}
