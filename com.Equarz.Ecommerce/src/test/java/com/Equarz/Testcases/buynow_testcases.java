package com.Equarz.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Pageobjects.buynow_functionality;
import com.base.Testbase;

public class buynow_testcases extends Testbase {
	
	
	buynow_functionality bf;
	Login_Functionality lg;
	
	
	public buynow_testcases()
	{
		super();
	}
	@BeforeMethod
	public void initialize() throws InterruptedException
	{
		
		Setup();
		lg=new Login_Functionality(driver);
		lg.verifylogin();
		bf=new buynow_functionality (driver);		
				
	}
	@Test()
	public void addbuy () throws InterruptedException 
	{
		bf.addbuy();
		
	}
	@Test()
	public void buy () throws InterruptedException 
	{
		bf.buynow();
		
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}

}
