package com.Equarz.Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Homepage_functionality;
import com.Pageobjects.Login_Functionality;
import com.Utils.Utils;
import com.base.Testbase;

public class Homepage_test extends Testbase {
	
	Homepage_functionality hf;
	
	
	public Homepage_test()
	{
		super();
	}
	@BeforeMethod
	public void intialization()
	{
		Setup();
		hf= new Homepage_functionality(driver);
		
	}
//	@Test(priority = 1)
//	public void validatelogin() throws InterruptedException
//	{
//		lg.Verifylogin();
//	
//	}
	@Test()
	public void validateaddtocart() throws InterruptedException {
		
		hf.verifyaddtocart();
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/product/mouse-hp-hHfrUI", url);
	}

}
