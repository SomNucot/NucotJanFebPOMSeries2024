package com.qa.hrm.pagetests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.hrm.driverfactorysetup.DriverFactory;
import com.qa.hrm.pages.LoginPage;


public class BaseTest {
	
	DriverFactory df;
	WebDriver odriver;
	protected LoginPage loginPage;
	
	
	
	@BeforeTest
	public void setUp()
	{
		df=new DriverFactory();
		odriver=df.initDriver();
		loginPage=new LoginPage(odriver);
		
		
	}
	
	@AfterTest
	public void appClose()
	{
		odriver.quit();
		
	}
	
	

}
