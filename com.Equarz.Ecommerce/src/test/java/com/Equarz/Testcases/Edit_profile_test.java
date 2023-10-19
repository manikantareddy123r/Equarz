package com.Equarz.Testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Edit_profile_info_functionality;
import com.Pageobjects.Login_Functionality;
import com.base.Testbase;

public class Edit_profile_test extends Testbase {
	
	Edit_profile_info_functionality ef;
	Login_Functionality lg;
	
	
	public Edit_profile_test ()
	{
		super();
	}
	@BeforeClass
	public void login() throws InterruptedException
	{
		Setup();
		lg=new Login_Functionality(driver);
		lg.verifylogin();
		
	}
	@BeforeMethod
	public void initialize() 
	{
		
//		Setup();
//		lg=new Login_Functionality(driver);
//		lg.validateLogin();
		ef=new Edit_profile_info_functionality (driver);		
				
	}
	@Test()
	public void search() throws InterruptedException, AWTException
	{
		ef.editprofie();

}
}
