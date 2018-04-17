package com.qa.testcases;


import org.testng.annotations.Test;
import com.qa.testBase.AbstractPage;

public class VerifyTheItemsinPLP extends AbstractPage {


	@Test(enabled=true)
	public void VerifyPrimeItemsinFirstPLP() {
		System.out.println("VerifyPrimeItemsinFirstPLP");
	//	extentTest = extent.startTest("VerifyPrimeItemsinFirstPLP");
		homePage.navigateToPLP("TV, Appliances, Electronics", "DSLR Cameras");
		productListPage.noIfPrimeItems();
	}

	@Test(enabled=true)
	public void VerifyPrimeItemsinFirstPLP2() {
		//extentTest = extent.startTest("VerifyPrimeItemsinFirstPLP2");
		homePage.navigateToPLP("TV, Appliances, Electronics", "DSLR Cameras");
		productListPage.noIfPrimeItems();
	}
	
	@Test(enabled=true)
	public void VerifyPrimeItemsinFirstPLP3() {
		//extentTest = extent.startTest("VerifyPrimeItemsinFirstPLP3");
		homePage.navigateToPLP("TV, Appliances, Electronics", "DSLR Cameras");
		productListPage.noIfPrimeItems();
	}
	
	@Test(enabled=true)
	public void VerifyPrimeItemsinFirstPLP4() {
		//extentTest = extent.startTest("VerifyPrimeItemsinFirstPLP4");
		homePage.navigateToPLP("TV, Appliances, Electronics", "DSLR Cameras");
		productListPage.noIfPrimeItems();
	}
	
}
