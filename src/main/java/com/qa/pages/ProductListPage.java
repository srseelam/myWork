package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.AbstractPage;

public class ProductListPage extends AbstractPage {
	
	@FindBy(id="mainResults")
	WebElement itemListInPLP;
	
	@FindBy(css=".a-icon.a-icon-prime.a-icon-small")
	List<WebElement> listOfPrimeItems;
	
	@FindBy(css="#result_0 img")
	WebElement firstItemInPLP;
	
	public ProductListPage(){
		PageFactory.initElements(driver, this);
	}

	public void noIfPrimeItems(){
		System.out.println("No of prime items = " + listOfPrimeItems.size());
	}
	
	public void navigateToFirstItemPDP(){
		firstItemInPLP.click();
	}
}
