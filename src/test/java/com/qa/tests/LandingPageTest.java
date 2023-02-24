package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.qa.base.TestBase;
import com.qa.pages.LandingPage;
import com.qa.pages.SignInPage;
import com.qa.util.ExtentTestManager;

public class LandingPageTest extends TestBase {
	LandingPage landingPage; 
	SignInPage signInPage;
	
	// call super in constructor
	public  LandingPageTest()
	{
		super();
	}
	
	// Create page class object
@BeforeMethod()
public void setUp()
{
	init ();
	landingPage =new LandingPage();
}

@Test(priority=1)
public void validateLoginPageatitle()
{
	//ExtentTestManager.getTest().log(Status.INFO, "Started Validating page title");
	boolean title=landingPage.isLogoVisible();
	Assert.assertEquals(title, true);
}


@Test(priority=2)
public void clickOnLink()
{//ExtentTestManager.getTest().log(Status.INFO, "Clicking on signin button");
	signInPage=landingPage.clickOnSignInButton();
	
}
@AfterMethod
public void tearDown()
{
	driver.quit();
}

	
}
