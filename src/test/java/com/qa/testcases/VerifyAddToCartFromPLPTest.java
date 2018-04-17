package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.testBase.AbstractPage;

public class VerifyAddToCartFromPLPTest extends AbstractPage{
		
	@Test(enabled=true)
	public void addFirstItemfromPLP(){
		System.out.println("addFirstItemfromPLP");
		//extentTest = extent.startTest("addFirstItemfromPLP");
		homePage.navigateToPLP("TV, Appliances, Electronics", "DSLR Cameras");
		productListPage.navigateToFirstItemPDP();
		switchToNewTab();
		productDetailsPage.addItemToCart();
		cartPage.proceedToCheckOutPage();
		//loginPage.login();
		
	}
	
	@Test(enabled=true)
	public void addFirstItemfromPLP2(){
	//	extentTest = extent.startTest("addFirstItemfromPLP2");
		homePage.navigateToPLP("TV, Appliances, Electronics", "DSLR Cameras");
		productListPage.navigateToFirstItemPDP();
		switchToNewTab();
		productDetailsPage.addItemToCart();
		cartPage.proceedToCheckOutPage();
	//	loginPage.login();
		
	}

	@Test(enabled=true)
	public void addFirstItemfromPLP3(){
	//	extentTest = extent.startTest("addFirstItemfromPLP3");
		homePage.navigateToPLP("TV, Appliances, Electronics", "DSLR Cameras");
		productListPage.navigateToFirstItemPDP();
		switchToNewTab();
		productDetailsPage.addItemToCart();
		cartPage.proceedToCheckOutPage();
		//loginPage.login();
		
	}
	
	@Test(enabled=true)
	public void addFirstItemfromPLP4(){
	//	extentTest = extent.startTest("addFirstItemfromPLP4");
		homePage.navigateToPLP("TV, Appliances, Electronics", "DSLR Cameras");
		productListPage.navigateToFirstItemPDP();
		switchToNewTab();
		productDetailsPage.addItemToCart();
		cartPage.proceedToCheckOutPage();
		//loginPage.login();
		
	}
}
