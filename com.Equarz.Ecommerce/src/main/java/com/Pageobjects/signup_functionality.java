package com.Pageobjects;

import javax.swing.JOptionPane;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class signup_functionality extends Testbase {
	
	
	@FindBy(name="f_name")
	WebElement fname;
	
	@FindBy(name="l_name")
	WebElement lastname;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pass;
	
	@FindBy(xpath="//input[@name='con_password']")
	WebElement cpass;
	
	@FindBy(id="inputCheckd")
	WebElement checkbox;
	
   // @FindBy(xpath="//span[@class='mb-4px d-block w-0 flex-grow pl-1']")
	//WebElement condition;
	//String str=JOptionPane.showInputDialog("Enter captha");
//	@FindBy(name="default_captcha_value")
//    WebElement captcha;
	
	
	@FindBy(xpath="//i[@class='czi-user mr-2 ml-n1']")
	WebElement signup;
	
	
	public signup_functionality(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public Homepage signup(String fname1,String lastname1,String email1,String phone1,String pass1,String cpass1) throws InterruptedException {
		fname.sendKeys(fname1);
		lastname.sendKeys(lastname1);
		email.sendKeys(email1);
		phone.sendKeys(phone1);
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,750)");
//        
		pass.sendKeys(pass1);
		cpass.sendKeys(cpass1);
		checkbox.click();
		
		//condition.click();
		//captcha.click();
		Thread.sleep(10000);
		signup.click();
		
		return new Homepage();
		
	
		
	}
	
	
	

}
