package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {

	@BeforeSuite
	private void propertySetting() {
		System.out.println("Property Settign");
	}
	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}
	@BeforeClass
	private void urlLaunch() {
		System.out.println("URL launch");
	}
	@BeforeMethod
	private void login() {
		System.out.println("LOGIN");
		
	}
	@Test
	private void women() {
		System.out.println("WOMEN");
	}
	@Test
	private void kids() {
		System.out.println("KIDS");
	}
	@Test
	private void men() {
		System.out.println("MEN");
	}
	@AfterMethod
	private void logout() {
		System.out.println("LOGOUT");
	}
	@AfterClass
	private void screenShot() {
		System.out.println("SCREENSHOT");
	}
	@AfterTest
	private void closeBrowser() {
		System.out.println("CLOSE BROWSER");
	}
	@AfterSuite
	private void terminateBrowser() {
		System.out.println("TERMINATE BROWSER");
	}
}

