package com.Pageobjects;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;


public class Login_Functionality extends Testbase {
	
	@FindBy(id = "si-email")
	WebElement username;

	@FindBy(id= "si-password")
	WebElement password;
	
//	String str=JOptionPane.showInputDialog("Enter captha");
//	
//	@FindBy(name="default_captcha_value")
//	WebElement captcha;
	
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement signinbtn;
	
	
	
	public Login_Functionality(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public Homepage Verifylogin(String username1,String password1) throws InterruptedException {

		username.sendKeys(username1);
		password.sendKeys(password1);
		//captcha.sendKeys(str);
		Thread.sleep(10000);
		signinbtn.click();

		return new Homepage();
	}

	

	
}
