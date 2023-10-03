package com.Equarz.Testcases;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Utils.Utils;
import com.base.Testbase;


public class LoginTest extends Testbase {
	
	
	//WebDriver driver;
	Login_Functionality lg;
	
	
	public LoginTest()
	{
		super();
	}
	@BeforeMethod
	public void intialization()
	{
		Setup();
		lg= new Login_Functionality(driver);
		
	}
//	@Test(priority = 1)
//	public void validatelogin() throws InterruptedException
//	{
//		lg.Verifylogin();
//	
//	}
	//@Test(dataProvider = "setdata",dataProviderClass = Utils.class)
	@Test
	//public void verifyurl(String username, String password) throws InterruptedException {
	
	public void verifyurl() throws InterruptedException {
		
		lg.verifylogin();
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/", url);
	}
	



}
