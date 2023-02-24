package com.qa.base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.TestUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
protected static WebDriver driver;
public static Properties prop;
public TestBase()
{
	FileReader reader;
	try {
		reader = new FileReader("./src/main/java/config/config.properties");
		prop=new Properties();
		 prop.load(reader);	 
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void init()
{
	String browserName=prop.getProperty("browser");
	if(browserName.equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(TestUtilities.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtilities.IMPLICIT_WAIT_TIMEOUT, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
}
}
