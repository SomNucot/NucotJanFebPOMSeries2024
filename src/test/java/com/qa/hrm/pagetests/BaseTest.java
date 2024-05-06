package com.qa.hrm.pagetests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qa.hrm.driverfactorysetup.DriverFactory;
import com.qa.hrm.pages.LoginPage;


public class BaseTest {
	
	DriverFactory df;
	WebDriver odriver;
	protected LoginPage loginPage;
	Properties prop;
	
	
	@BeforeTest
	@Parameters("browser")
	public void setUp()
	{
		df=new DriverFactory();
		prop=df.initProp();
		odriver=df.initDriver(prop);
		loginPage=new LoginPage(odriver);
		
		
	}
	
	@AfterTest
	public void appClose()
	{
		odriver.quit();
		
	}
	
	

}
