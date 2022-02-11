package com.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.CommonFunction.CommonFunctionHRM;
import com.PageObject.LoginPageHRM;
import com.TestData.HRMLoginTestData;



public class BaseClassHRM {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", HRMLoginTestData.getChrompath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(HRMLoginTestData.getApplicationurl());
		
		LoginPageHRM Lp= new LoginPageHRM(driver);
		
		CommonFunctionHRM.enterText(Lp.EntUserName, HRMLoginTestData.getApplicationUsername());
		
		CommonFunctionHRM.enterText(Lp.EntPassword, HRMLoginTestData.getApplicationPassword());
		
		CommonFunctionHRM.click(Lp.Csubmit);
		
		
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
