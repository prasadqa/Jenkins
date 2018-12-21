package com.google.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleVerifyPageTest 
{
	private WebDriver driver;
	String pageURL = "https://www.google.com/";
	
	@BeforeMethod
	public void setUpBeforeTest()
	{

        System.setProperty("webdriver.chrome.driver","D:\\SeleniumSamples\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(pageURL);
	}
	
	@Test
	public void titleVerify()
	{
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, "Gogle");
	}
	
	
	
	
	@AfterMethod
	public void setUpAfterTest()
	{

        driver.quit();
	}

	
			
}
