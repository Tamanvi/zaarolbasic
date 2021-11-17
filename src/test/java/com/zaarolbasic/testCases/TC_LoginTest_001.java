package com.zaarolbasic.testCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zaarolbasic.pageObjects.LoginPage;



public class TC_LoginTest_001 extends BaseClass{
	
	
	
	
	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		logger.info("...Opened Admin Portal");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("...Provided User Name");
		lp.setPassword(password);
		logger.info("...Provided Password");
		lp.clickLogin();
		logger.info("...Singned in");
		lp.clickSignOut();
		logger.info("...Signed out");
		Thread.sleep(20000);
		lp.clickLogOut();
		logger.info("...Logged out");
		
		//Thread.sleep(2000);
		/*
		if(driver.getTitle().equals("Wantedly writing wrong"))
		{
			Assert.assertTrue(true);
			logger.info("...This should not print");
		}else {
			captureScreen(driver,"loginTest");
			logger.info("...Login Failed took screenshot");
			Assert.assertTrue(false);
		}
		*/
		
	}
	
	
}
