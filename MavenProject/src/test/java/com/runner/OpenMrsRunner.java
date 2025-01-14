package com.runner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.listeners.ExtentReport_Test;
//import com.listeners.ExtentReport_Test;
//import com.listeners.ITestListenersClass;
import com.pageobjectmanager.OpenMrsPageObjectManager;
//@Listeners(ITestListenersClass.class)
public class OpenMrsRunner extends BaseClass{

	OpenMrsPageObjectManager page = new OpenMrsPageObjectManager();

	@BeforeTest
	public void setUp() throws IOException {
		launchBrowser(page.getFileReader().getDataProperty("browser"));
	}
	
//	@Test(priority = -10)
//	public void invalidCredentials() throws IOException {
//		Assert.assertTrue(page.getLoginPage().validUserNameAndInvalidPassword());
//	}
//	@Test(priority = -5)
//	public void withoutLocation() throws IOException {
//		Assert.assertTrue(page.getLoginPage().InvalidUserNameAndValidPassword());
//	}
//	@Test(priority = 1)
//	public void withoutAnyData() throws IOException {
//		Assert.assertTrue(page.getLoginPage().WithoutClickingLocation());
//	}
	
	@Test(priority = 5)
	public void validCredentials() throws IOException {
		ExtentReport_Test.extenttest = extentReports.createTest("Login Test" + " " + Thread.currentThread().getStackTrace()[1].getMethodName().toString()).info("Valid Login");
		Assert.assertTrue(page.getLoginPage().validUserNameAndValidPassword(ExtentReport_Test.extenttest));
	}
	private void extentReportStartup() {
		extentReportStart("C:\\Users\\syedt\\eclipse-workspace\\MavenProject\\Reports");
	}
	private void extentReportEnd() throws IOException {
		extentReportTearDown("C:\\Users\\syedt\\eclipse-workspace\\MavenProject\\Reports\\index.html");
	}
	@AfterTest
	private void termination() {
		terminateBrowser();
	}
	
}
