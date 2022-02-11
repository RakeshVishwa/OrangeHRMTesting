package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageHRM {
	
	WebDriver ldriver;
	
	public LoginPageHRM(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public @FindBy(name="txtUsername") WebElement EntUserName;
	
	public @FindBy(name="txtPassword") WebElement EntPassword;
	
	public @FindBy(name="Submit") WebElement Csubmit;

}
