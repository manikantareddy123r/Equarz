package com.Equarz.Testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Pageobjects.logout_functionality;
import com.base.Testbase;

public class logout_test extends Testbase{
	
	logout_functionality lf;
	Login_Functionality lg;
	
	
	public logout_test ()
	{
		super();
	}
	
	@BeforeMethod
	public void initialize() throws InterruptedException 
	{
		
		Setup();
		lg=new Login_Functionality(driver);
		lg.verifylogin();
		lf=new logout_functionality (driver);		
				
	}
	@Test()
	public void logout() throws InterruptedException, AWTException
	{
		lf.logout();
		
	}
	@Test()
	public void refresh() throws InterruptedException, AWTException
	{
		lf.refresh();
		
	}
	@Test()
	public void back() throws InterruptedException, AWTException
	{
		lf.back();
		
	}

}
