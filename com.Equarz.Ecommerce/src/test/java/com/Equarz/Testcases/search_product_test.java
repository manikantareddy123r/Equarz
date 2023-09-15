package com.Equarz.Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.search_product_addtocart;
import com.Pageobjects.signup_functionality;
import com.Utils.Utils;
import com.base.Testbase;

public class search_product_test extends Testbase {
	
	
	search_product_addtocart cf;
	
	
	public search_product_test()
	{
		super();
	}
	@BeforeMethod
	public void intialization()
	{
		Setup();
		cf= new search_product_addtocart(driver);
		
	}
//	@Test(priority = 1)
//	public void validatelogin() throws InterruptedException
//	{
//		lg.Verifylogin();
//	
//	}
	@Test()
	public void verifyurl() throws InterruptedException {
		
		cf.Verifylogin();
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/product/cosmus-webstar-45-cm-laptop-backpack-35-ltrs-large-school-bagtravel-bagpack-grey-9yAcYd", url);
	}

}
