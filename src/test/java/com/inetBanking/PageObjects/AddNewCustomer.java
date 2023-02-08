package com.inetBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {
	WebDriver ldriver;
	
	public  AddNewCustomer(WebDriver rdriver) {

		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
		
	}
	@FindBy(xpath="//ul[@class='menusubnav']/li[2]/a")
	WebElement neuCustomer;
	@FindBy(css="input[name=name]")
	WebElement name;
	@FindBy(css="input[value=m]")
	WebElement gender;
	@FindBy(css="input[type=date]")
	WebElement dob;
	@FindBy (xpath="//*[contains(@onblur,'Add')]")
	WebElement addres;
	@FindBy(css="[name=city]")
	WebElement city;
	@FindBy(css="[name=pinno")
	WebElement pin;
	@FindBy(css="[name=telephoneno")
	WebElement phone;
	@FindBy(css="[name=emailid")
	WebElement mail;
	@FindBy(css="[name=password")
	WebElement password;
	@FindBy(css="[type=reset]")
	WebElement reset;
	@FindBy(css="[type=submit]")
	WebElement submit;
	@FindBy(css="[name=state")
	WebElement state;
	
	public void entreCustName() {
		name.sendKeys("ramanji");
		
	}
	public void clickGender() {
		gender.click();
		
	}
	public void entreDateofBirth() {
		dob.sendKeys("20-01-1991");
		
	} 
	public void enterAddres() {
		addres.sendKeys("3_71,kunkalagunta");
	}
	public void enterCity() {
		city.sendKeys("Guntur");
	}
	public void enterPinNo() {
		pin.sendKeys("522615");
	}
	public void enterPhoneNo() {
		phone.sendKeys("7095300947");
		
	}
	public void enterMailId() {
		mail.sendKeys("ramanjaneyuluv3@gmain.com");
	}
	public void enterPassWord() {
		password.sendKeys("0543");
	}
	public void clickResetButton() {
		reset.click();
	}
	public void clickSubmitButton() {
		submit.click();
	}
	public void enterState() {
		state.sendKeys("Andhra Pradesh");
	}
	public void newCustomer() {
		neuCustomer.click();
	}
	

}
