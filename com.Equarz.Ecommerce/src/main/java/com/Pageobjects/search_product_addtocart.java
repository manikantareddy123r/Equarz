package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class search_product_addtocart extends Testbase{
	
	@FindBy(xpath="//button[@class='close __close']")
	WebElement close;
	@FindBy(xpath="//input[@class='form-control appended-form-control search-bar-input']")
	WebElement search;
	
	@FindBy(xpath="//span[@class='input-group-text __text-20px']")
	WebElement button;
	
	@FindBy(xpath="//img[@src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-27-649a8fa758cac.png']")
	WebElement product;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addcart;
	
	

	
	
	
	
	public search_product_addtocart(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public Homepage Verifylogin() throws InterruptedException {
		
		close.click();

		search.sendKeys(props.getProperty("search"));
		button.click();
		
		Thread.sleep(5000);
		product.click();
		Thread.sleep(5000);
		addcart.click();
		
		

		return new Homepage();
	}

}
