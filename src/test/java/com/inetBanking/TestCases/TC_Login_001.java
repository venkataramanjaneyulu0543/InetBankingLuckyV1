package com.inetBanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.PageObjects.LoginPage;

public class TC_Login_001 extends BaseClass {
	
	@Test
	public void logTest() {
		driver.get(url);
		// logger.info("enter Url");
		LoginPage lp=new LoginPage(driver);
		lp.enterUser(user);
		lp.enterpass(pass);
		lp.clickLog();
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")){
		Assert.assertTrue(true);
		//logger.info("Test Case is Pass");
			
		}else {
			
			Assert.assertTrue(false);
		}
				
	}
	

}
