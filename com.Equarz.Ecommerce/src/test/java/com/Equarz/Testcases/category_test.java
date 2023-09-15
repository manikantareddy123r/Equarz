package com.Equarz.Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.search_product_addtocart;
import com.Pageobjects.category_product_functionality;
import com.base.Testbase;

public class category_test  extends Testbase{
	
	
	category_product_functionality pf;
	
	
	public category_test()
	{
		super();
	}
	@BeforeMethod
	public void intialization()
	{
		Setup();
		pf= new category_product_functionality(driver);
		
	}
//	@Test(priority = 1)
//	public void validatelogin() throws InterruptedException
//	{
//		lg.Verifylogin();
//	
//	}
	@Test()
	public void verifyurl() throws InterruptedException {
		
		pf.validateproduct();
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/product/11-previous-year-upsc-capf-assistant-commandant-2022-2012-solved-papers-i-ii-with-5-practice-sets-2nd-edition-capf-ac-ex", url);
	}

	
	

}
