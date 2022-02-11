package com.TestData;

import com.CommonFunction.CommonFunctionHRM;

public class HRMAddEmployeeTestData {
	
	static String FirstName="Raj";
	
	static String MiddleName = "Sonu";
	
	static String LastName = "Pal";
	
	static String UploadPhoto= "C:\\Users\\91816\\Downloads\\website.jpg";
	
	static String UserName = CommonFunctionHRM.randomAlphaNumeric(5);
	
	static String UserPassword = "Raj@1234";
	
	static String ConfirmUserPassword = "Raj@1234";
	
	public static String getFirstName()
	{
		return FirstName;
	}
	
	public static String getMiddleName()
	{
		return MiddleName;
	}
	
	public static String getLastName()
	{
		return LastName;
	}
	
	public static String getPhoto()
	{
		return UploadPhoto;
	}
	
	public static String getUserName()
	{
		return UserName;
	}
	
	public static String getUserPassword()
	{
		return UserPassword;
	}
	
	public static String getConfirmUserPassword()
	{
		return ConfirmUserPassword;
	}

}
