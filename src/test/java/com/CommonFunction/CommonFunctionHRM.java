package com.CommonFunction;

import org.openqa.selenium.WebElement;

public class CommonFunctionHRM {
	
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	

	public static void enterText(WebElement locaElement, String value)
	{
		locaElement.sendKeys(value);

	}

	public static WebElement click(WebElement locaElement) {
		locaElement.click();
		
		return locaElement;

	}
	
	public static void clear(WebElement localElement)
	{
		localElement.clear();
	}
	
	public static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
		int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
		builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
		}

}
