package com.TestNG;

import com.baseclass.BaseClass;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest extends BaseClass{
@Test ((dataProvider="login"),(invocationCount=4))
  public void login(String username, String password) {
	  launchBrowser("chrome");
	  launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  implicitWait(20);
	  driver.findElement(By.xpath("//input[@fdprocessedid='625h4g']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@fdprocessedid='dam4r9']]")).sendKeys(password);
	  driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	  terminateBrowser();
}


	@DataProvider(name = "login")
	public Object[] [] dataset(){
	return new Object[] [] 
			{{"ABC","123"} , {"",""},{"Admin","admin123"}};
	}}
	



	

