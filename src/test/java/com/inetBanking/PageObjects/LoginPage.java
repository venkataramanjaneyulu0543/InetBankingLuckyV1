package com.inetBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	public LoginPage(WebDriver rdriver){
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(css="[type=text]")
	WebElement userId;
	@FindBy(css="[type=password]")
	WebElement passWord;
	@FindBy(css="[type=submit]")
	WebElement logIn;
	
	public void enterUser(String user) {
		userId.sendKeys(user);
	}
	public void enterpass(String pass) {
		passWord.sendKeys(pass);
	}
	public void clickLog() {
		logIn.click();
	}
	






}

