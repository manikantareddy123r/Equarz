package com.Equarz.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Pageobjects.signup_functionality;
import com.Utils.Utils;
import com.base.Testbase;

public class signupTest extends Testbase {
	
	//WebDriver driver;
	signup_functionality sf;
	
	
	public signupTest()
	{
		super();
	}
	@BeforeMethod
	public void intialization()
	{
		Setup();
		sf= new signup_functionality(driver);
		
	}
//	@Test(priority = 1)
//	public void validatelogin() throws InterruptedException
//	{
//		lg.Verifylogin();
//	
//	}
	@Test(dataProvider = "setdata",dataProviderClass = Utils.class)
	public void verifyurl(String fname1,String lastname1,String email1,String phone1,String pass1,String cpass1) throws InterruptedException {
		
		sf.signup(fname1,lastname1,email1,phone1,pass1,cpass1);
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/customer/auth/login", url);
	}
	

}
