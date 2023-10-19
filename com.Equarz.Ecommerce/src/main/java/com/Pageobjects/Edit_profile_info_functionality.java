package com.Pageobjects;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class Edit_profile_info_functionality extends Testbase {
	
	@FindBy(xpath="//small[text()='Hello, Manikanta']")
	WebElement dashboard;
	
	@FindBy(xpath="//a[text()=' My profile']")
	WebElement myprofile;
	
	@FindBy(xpath="//label[@class='spandHeadO m-0']")
	WebElement upload;
	
	@FindBy(id="f_name")
	WebElement fname;
	
	@FindBy(xpath="//input[@id='l_name']")
	WebElement lname;
	
	@FindBy(xpath="//input[@id='phone']")
	WebElement phone;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement npassword;
	
	@FindBy(xpath="//input[@id='confirm_password']")
	WebElement cpassword;
	
	@FindBy(xpath="//button[text()='Update   ']")
	WebElement update;
	
	@FindBy(xpath="//div[text()='Updated successfully']")
	WebElement successful;
	
	public Edit_profile_info_functionality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	 public void editprofie() throws InterruptedException, AWTException
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(dashboard).build().perform();
		myprofile.click();
		upload.click();
		Robot rb=new Robot();
		rb.delay(3000);
		StringSelection ss=new StringSelection("\"C:\\Users\\ADMIN\\Desktop\\logo.jpeg\"");


		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		fname.clear();
		fname.sendKeys("Jakkam");
		lname.clear();
		lname.sendKeys("Sairam");
		phone.clear();
		phone.sendKeys("8106637137");
		npassword.clear();
		npassword.sendKeys("Namo@12345");
		cpassword.clear();
		cpassword.sendKeys("Namo@12345");
		update.click();
		String print=successful.getText();
		System.out.println(print);
		assertEquals("Updated successfully",print);
	}
	

}
