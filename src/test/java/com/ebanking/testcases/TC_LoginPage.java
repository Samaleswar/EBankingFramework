package com.ebanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.LoginPage;



public class TC_LoginPage extends BaseClass {
	
	
	@Test
	public void loginTest() {
		
		driver.get(baseUrl);
	logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(userName);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		
		
		Assert.assertTrue(driver.getTitle().equals("Guru99 Bank Manager HomePage"));
		logger.info("Title Verified.");
		
	}
}
