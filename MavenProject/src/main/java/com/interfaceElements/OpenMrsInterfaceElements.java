package com.interfaceElements;

public interface OpenMrsInterfaceElements {

	String userName_xpath = "//input[@id='username']";
	String passWord_xpath = "//input[@id='password']";
	String location_xpath = "//li[text()='Isolation Ward']";
	String login_id = "loginButton";
	 String error_message = "//div[text()='Invalid username/password. Please try again.']";
	 String location_error = "//*[contains (text(),'You must choose a locat')]";
	 
}
