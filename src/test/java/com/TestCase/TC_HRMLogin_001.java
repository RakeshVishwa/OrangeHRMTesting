package com.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_HRMLogin_001 extends BaseClassHRM {
	
	@Test
	public void ValidatonLogin()
	{
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
	}

	
	
}
