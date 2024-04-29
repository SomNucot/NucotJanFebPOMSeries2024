package com.qa.hrm.driverfactorysetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
	
	public WebDriver odriver;
	
	
	public WebDriver initDriver()
	{
		
		String browserName="chrome";
		System.out.println("browser name is :"+browserName);
		
		if(browserName.equalsIgnoreCase("chrome")){
			odriver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			odriver=new FirefoxDriver();
		}	
		else if(browserName.equalsIgnoreCase("safari")){
			odriver=new SafariDriver();
		}	
		else if(browserName.equalsIgnoreCase("edge")){
			odriver=new EdgeDriver();
		}	
		else if(browserName.equalsIgnoreCase("ie")){
			odriver=new InternetExplorerDriver();
		}
		else{
			System.out.println("Plz pass the right browser name"+browserName);
		}
		
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		return odriver;	
	}
	
	
	
	/*
	public Properties initProp()
	{
		
	 prop =new Properties ();
	 
	 try {
		
		 FileInputStream ip=new  FileInputStream("./src/main/resources/config/devconfig.properties");
		 prop.load(ip);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	
		return prop;
		
	*/	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


