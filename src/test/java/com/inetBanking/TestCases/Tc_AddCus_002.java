package com.inetBanking.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.inetBanking.PageObjects.AddNewCustomer;
import com.inetBanking.PageObjects.LoginPage;
@Test
public class Tc_AddCus_002 extends BaseClass {
	public void  addNewCustomerDetails() {
		AddNewCustomer ad=new AddNewCustomer(driver);
		LoginPage lp=new LoginPage(driver);
		lp.enterUser(user);
		lp.enterpass(pass);
		lp.clickLog();
		
		ad.newCustomer();
		ad.entreCustName();
		ad.clickGender();
		ad.entreDateofBirth();
		ad.enterAddres();
		ad.enterCity();
		ad.enterState();
		ad.enterPinNo();
		ad.enterPhoneNo();
		ad.enterMailId();
		ad.enterPassWord();
		ad.clickResetButton();
		ad.clickSubmitButton();
	
		// driver.quit();
	}

}
