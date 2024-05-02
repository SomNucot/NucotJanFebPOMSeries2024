package com.qa.hrm.pagetests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hrm.applicationconstants.ApplicationConstants;



public class LoginPageTest extends BaseTest {
	
	
	@Test(groups = {"Regression"})	
	public void loginPageCurrentUrl()
	{
		String actualUrl=loginPage.getLoginPageUrl();
		Assert.assertEquals(actualUrl,ApplicationConstants.LOGIN_PAGE_CURRENTURL);
		
	}
	
	@Test(groups = {"Smoke"})	
	public void loginPageTitle()
	{
		
		String actualTitle=loginPage.getLoginPageTitle();
		Assert.assertEquals(actualTitle,ApplicationConstants.LOGIN_PAGE_TITLE);
	}
	
	@Test(groups = {"Regression"})
	public void doLoginPageTest()
	{
		loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
