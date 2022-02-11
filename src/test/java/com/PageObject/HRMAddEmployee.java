package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMAddEmployee {
	
	WebDriver Adriver;
	
	public HRMAddEmployee(WebDriver pdriver)
	{
		Adriver=pdriver;
		PageFactory.initElements(pdriver, this);
	}
	
	public @FindBy(id="menu_pim_viewPimModule") WebElement CPim;
	
	public @FindBy(linkText="Add Employee") WebElement CAddEmployee;
	
	public @FindBy(name="firstName") WebElement EFirstName;
	
	public @FindBy(name="middleName") WebElement EMiddleName;
	
	public @FindBy(name="lastName") WebElement ELastName;
	
	public @FindBy(name="photofile") WebElement EBrowseFile;
	
	public @FindBy(name="chkLogin") WebElement CchkLogin;
	
	public @FindBy(name="user_name") WebElement EUserName;
	
	public @FindBy(name="user_password") WebElement EUserPassword;
	
	public @FindBy(name="re_password") WebElement EConfirmPassword;
	
	public @FindBy(id="btnSave") WebElement CSave;
	
	
	

}


