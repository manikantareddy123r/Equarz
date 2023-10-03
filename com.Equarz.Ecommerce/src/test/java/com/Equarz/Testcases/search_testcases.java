package com.Equarz.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Pageobjects.search_functionality;
import com.base.Testbase;

public class search_testcases extends Testbase {
	
	search_functionality bf;
	Login_Functionality lg;

	
	
	public search_testcases()
	{
		super();
	}
	@BeforeMethod
	public void initialize() throws InterruptedException
	{
		
		Setup();
		lg=new Login_Functionality(driver);
		lg.verifylogin();
		bf=new search_functionality (driver);		
				
	}
	@Test()
	public void search () throws InterruptedException 
	{
		bf.validatesearch();
		
	}
	@Test()
	public void searchdrop () throws InterruptedException 
	{
		bf.dropdownsearch();
		
	}
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}



}
