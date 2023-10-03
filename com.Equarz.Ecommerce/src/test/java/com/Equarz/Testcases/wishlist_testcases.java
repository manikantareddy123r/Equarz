package com.Equarz.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Pageobjects.Wishlist_functionality;
import com.base.Testbase;

public class wishlist_testcases extends Testbase {
	
	
	Wishlist_functionality wf;
	Login_Functionality lg;
	
	
	public wishlist_testcases()
	{
		super();
	}
	@BeforeMethod
	public void initialize() throws InterruptedException
	{
		
		Setup();
		lg=new Login_Functionality(driver);
		lg.verifylogin();
		wf=new Wishlist_functionality (driver);		
				
	}
	@Test()
	public void categorywishlist () throws InterruptedException 
	{
		wf.catwishlist();
		
	}
	
	@Test()
	public void searchwishlist() 
	{
		wf.searchwishlist();
	}
	@Test()
	public void bannerhwishlist() 
	{
		wf.bannerwishlist();
	}
	@Test()
	public void homehwishlist() 
	{
		wf.homewishlist();
	}
	@Test()
	public void dealswishlist() 
	{
		wf.dealswishlist();
		
	}
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}

}
