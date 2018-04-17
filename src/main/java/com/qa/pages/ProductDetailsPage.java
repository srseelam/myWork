package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.AbstractPage;

public class ProductDetailsPage extends AbstractPage{

	@FindBy(id="add-to-cart-button")
	WebElement addToCartButton;
	
	@FindBy(id="buy-now-button")
	WebElement buyNowButton;
	
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement addToWishlistButton;
	
	public ProductDetailsPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void addItemToCart(){
		addToCartButton.click();
	}
	
	public void addItemToCartUsingBuyNow(){
		buyNowButton.click();
	}
	
	public void addItemToWishlist(){
		addToWishlistButton.click();
	}
}
