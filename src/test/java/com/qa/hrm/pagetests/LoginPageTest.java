package com.qa.hrm.pagetests;

import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginPageTest extends BaseTest {
	
	
	@Test(priority=1)
	public void loginPageCurrentUrl()
	{
		String actualUrl=loginPage.getLoginPageUrl();
		Assert.assertEquals(actualUrl,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test(priority=2)
	public void loginPageTitle()
	{
		
		String actualTitle=loginPage.getLoginPageTitle();
		Assert.assertEquals(actualTitle,"OrangeHRM");
	}
	
	@Test(priority=3)
	public void doLoginPageTest()
	{
		loginPage.doLogin("Admin","admin123");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
