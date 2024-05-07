package com.qa.hrm.pagetests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hrm.applicationconstants.ApplicationConstants;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;



public class LoginPageTest extends BaseTest {
	
	
	@Test(description="Verify login page title",priority=1)
	@Description("Verify login page title")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC001")
	@Feature("CurrentUrl")
	public void loginPageCurrentUrl()
	{
		
        
		String actualUrl=loginPage.getLoginPageUrl();
		Assert.assertEquals(actualUrl,ApplicationConstants.LOGIN_PAGE_CURRENTURL);
		
	}
	
	
	@Test(description="Verify login page title",priority=2)
	@Description("Verify login page title")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC002")
	@Feature("PageTitle")
	public void loginPageTitle()
	{
		
		String actualTitle=loginPage.getLoginPageTitle();
		Assert.assertEquals(actualTitle,ApplicationConstants.LOGIN_PAGE_TITLE);
	}
	
	@Test(description="Verify login page title",priority=3)
	@Description("Verify login page title")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC003")
	@Feature("LoginPage")
	public void doLoginPageTest()
	{
		loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		System.out.println(Thread.currentThread().getId());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
