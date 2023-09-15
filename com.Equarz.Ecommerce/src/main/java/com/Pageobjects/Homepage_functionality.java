package com.Pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class Homepage_functionality extends Testbase {
	
	
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/mouse-hp-hHfrUI']")
	WebElement product;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addproduct;
	
	public Homepage_functionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public Homepage verifyaddtocart() {
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,750)");
		product.click();
		addproduct.click();
		return new Homepage();
		
		
		
	}

	
	
	

}
