package com.TestData;

public class HRMLoginTestData {
	//data
	
	static String HRMChromepath="D:\\Eclipse_WorkSpace\\ORANGRHRM01\\Drivers\\chromedriver.exe";
	
	static String HRMURL = "https://opensource-demo.orangehrmlive.com/";
	
	static String HRMUsername = "Admin";
	
	static String HRMPassword = "admin123";
	
	public static String getChrompath()
	{
		return HRMChromepath;
	}
	
	public static String getApplicationurl()
	{
		return HRMURL;
	}
	
	public static String getApplicationUsername()
	{
		return HRMUsername;
	}
	
	public static String getApplicationPassword()
	{
		return HRMPassword;
	}

}
