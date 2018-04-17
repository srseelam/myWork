package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.AbstractPage;

public class LoginPage extends AbstractPage{

	@FindBy(id="ap_email")
	WebElement emailId;
	
	@FindBy(id="continue")
	WebElement continueButton;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement loginButton;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void login(){
		emailId.sendKeys(prop.getProperty("User"));
		continueButton.click();
		password.sendKeys(prop.getProperty("Password"));
		loginButton.click();
	}
	
}
