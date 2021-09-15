package com.ebanking.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.ebanking.utilities.ReadConfig;


public class BaseClass {
	ReadConfig config=new ReadConfig();
	
	public String baseUrl=config.getApplicationUrl();
	public String userName=config.getUsername();
	public String password=config.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",config.getChromepath());
		driver=new ChromeDriver();
	
		logger=Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
		
		
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
}
