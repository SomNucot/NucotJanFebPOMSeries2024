package com.qa.hrm.driverfactorysetup;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;



public class DriverFactory {
	
	public WebDriver odriver;
	public Properties 	prop;
	public OptionsManager optionsManager;
	
	public WebDriver initDriver(Properties prop)
	{
		
		optionsManager=new OptionsManager(prop);
		String browserName=prop.getProperty("browser").trim();
		System.out.println("browser name is :"+browserName);
		
		if(browserName.equalsIgnoreCase("chrome")){
			odriver=new ChromeDriver(optionsManager.getChromeOptions());
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			odriver=new FirefoxDriver(optionsManager.getFirefoxOptions());
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
		odriver.get(prop.getProperty("url"));
		return odriver;	
	}
	
	
	
	
	public Properties initProp()
	{
		
		Properties prop =new Properties ();
	 
	 try {
		
		 FileInputStream ip=new  FileInputStream("./src/resource/main/config/configdev.properties");
		 prop.load(ip);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	
		return prop;
		
	
		
	}
	
	
}
	
	
	
	
	
	
	
	
	
	


