 package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;
import com.interfaceElements.interfaceElements;
import com.srcmainresource.FileReaderManager;

public class AdactinLoginPage extends BaseClass implements interfaceElements{
	@FindBy(id=userName_id)
	private WebElement username ;
	
	@FindBy(name=passWord_name)
	private WebElement password ;
	
	@FindBy(id = loginButton_id)
	private WebElement loginbutton ;
	
	public AdactinLoginPage(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		
		
	}

	public void validUserNameAndValidPassword() throws IOException
	{
		FileReaderManager data = new FileReaderManager();
		passInput(username, data.getDataProperty("Username"));
		passInput(password, data.getDataProperty("password"));
		clickElement(loginbutton);

		
		
	}
	
	
}
