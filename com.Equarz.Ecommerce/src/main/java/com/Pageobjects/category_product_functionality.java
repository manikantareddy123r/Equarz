package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class category_product_functionality extends Testbase {
	
	
	@FindBy(xpath="//button[@class='close __close']")
	WebElement close;
	
	@FindBy(xpath="//span[text()='Books']")
	WebElement category;
	
	@FindBy(xpath="//span[text()='Exam central']")
	WebElement sub_cat;
	
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/11-previous-year-upsc-capf-assistant-commandant-2022-2012-solved-papers-i-ii-with-5-practice-sets-2nd-edition-capf-ac-ex']")
    WebElement product;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addproduct;
	
	
	public category_product_functionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public Homepage validateproduct() {
		
		close.click();
		Actions ac=new Actions(driver);
		ac.moveToElement(category).build().perform();
		sub_cat.click();
		product.click();
		addproduct.click();
		return new Homepage();
		
	}
	

}
