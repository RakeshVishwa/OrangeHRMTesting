package com.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.CommonFunction.CommonFunctionHRM;
import com.PageObject.HRMAddEmployee;
import com.TestData.HRMAddEmployeeTestData;


public class TC_HRMAddEmployee_002 extends BaseClassHRM {
	
	@Test
	public void AddEmployee()
	{
		HRMAddEmployee Ae=new HRMAddEmployee(driver);
		
		CommonFunctionHRM.click(Ae.CPim);
		
		 try 
		 { 
			 Thread.sleep(5000);
			 } 
		 catch (Exception e) 
		 { 
			System.out.println("Error Massage is: "+e.getMessage());
		 }
		
		CommonFunctionHRM.click(Ae.CAddEmployee);
		
		CommonFunctionHRM.enterText(Ae.EFirstName, HRMAddEmployeeTestData.getFirstName());
		
		CommonFunctionHRM.enterText(Ae.EMiddleName, HRMAddEmployeeTestData.getMiddleName());
		
		CommonFunctionHRM.enterText(Ae.ELastName, HRMAddEmployeeTestData.getLastName());
		
		CommonFunctionHRM.enterText(Ae.EBrowseFile, HRMAddEmployeeTestData.getPhoto());
		
		CommonFunctionHRM.click(Ae.CchkLogin);
		
		CommonFunctionHRM.enterText(Ae.EUserName, HRMAddEmployeeTestData.getUserName());
		
		CommonFunctionHRM.enterText(Ae.EUserPassword, HRMAddEmployeeTestData.getUserPassword());
		
		CommonFunctionHRM.enterText(Ae.EConfirmPassword, HRMAddEmployeeTestData.getConfirmUserPassword());
		
		CommonFunctionHRM.click(Ae.CSave);
		
		if(driver.getTitle().equals("OrangeHRM"))
		{
			Assert.assertTrue(true);
			//boolean flag= true;
			
			System.out.println("Test Case Passed");
		}
		else
		{
			Assert.assertTrue(false);
			//boolean flag= false;
			
			System.out.println("Test Case Failed");
		}
		
		//Login
		
		
	}

}
