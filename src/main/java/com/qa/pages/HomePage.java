package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.AbstractPage;

public class HomePage extends AbstractPage {

	
	@FindBy(id = "nav-link-shopall")
	WebElement topnagivation;

	/*
	 * Elements on the page
	 */
	public WebElement getNavigationElement(String mainNavName) {
		
		String mainNavXpath = "//span[contains(text(), '" + mainNavName + "')]";
		WebElement navigationElement = driver
				.findElement(By.xpath(mainNavXpath));
		return navigationElement;
	}

	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	
	/*
	 * Actions on the page
	 */
	
	
	public ProductListPage navigateToPLP(String mainNav, String subCatName){
		mouseoverTo(topnagivation);
		mouseoverTo(getNavigationElement(mainNav));
		getNavigationElement(subCatName).click();
		return new ProductListPage();
	}
}
