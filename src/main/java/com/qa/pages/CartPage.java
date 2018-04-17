package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.AbstractPage;

public class CartPage extends AbstractPage{
	
	@FindBy(id="hlb-ptc-btn-native")
	WebElement proceedToCheckoutButton;
	
	public CartPage(){
		PageFactory.initElements(driver, this);
	}

	public void proceedToCheckOutPage(){
		proceedToCheckoutButton.click();
	}
}
