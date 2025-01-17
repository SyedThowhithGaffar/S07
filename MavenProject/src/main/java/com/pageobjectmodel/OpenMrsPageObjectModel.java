package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.baseclass.BaseClass;
import com.interfaceElements.OpenMrsInterfaceElements;
import com.srcmainresource.OpenMrsFileReaderManager;

public class OpenMrsPageObjectModel extends BaseClass implements OpenMrsInterfaceElements {

	@FindBy(xpath = userName_xpath)
	private WebElement username;

	@FindBy(xpath = passWord_xpath)
	private WebElement password;

	@FindBy(xpath = location_xpath)
	private WebElement location;

	@FindBy(id = login_id)
	private WebElement login;

	@FindBy(xpath = error_message)
	private WebElement invaliderror;

	@FindBy(xpath = location_error)
	private WebElement locationNotSelected;

	public OpenMrsPageObjectModel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean validUserNameAndValidPassword(ExtentTest extenttest) throws IOException {
		try {
			OpenMrsFileReaderManager data = new OpenMrsFileReaderManager();
			launchUrl(data.getDataProperty("url"));
			passInput(username, data.getDataProperty("lnusername"));
			passInput(password, data.getDataProperty("lnpassword"));
			clickElement(location);
			clickElement(login);
			validation(driver.getTitle(), data.getDataProperty("title"));
			extenttest.log(Status.PASS, "Login Successful");
		} catch (IOException e) {
			extenttest.log(Status.PASS, "Login Failed " + e.getMessage());
			e.printStackTrace();
			return false;
		}
		return true;

	}

	public boolean validUserNameAndInvalidPassword() throws IOException {
		OpenMrsFileReaderManager data = new OpenMrsFileReaderManager();
		launchUrl(data.getDataProperty("url"));
		passInput(username, data.getDataProperty("lnusername"));
		passInput(password, data.getDataProperty("empty"));
		clickElement(location);
		clickElement(login);
		validation(invaliderror.getText(), data.getDataProperty("invaliderror"));
		return true;

	}

	public boolean InvalidUserNameAndValidPassword() throws IOException {
		OpenMrsFileReaderManager data = new OpenMrsFileReaderManager();
		launchUrl(data.getDataProperty("url"));
		passInput(password, data.getDataProperty("lnpassword"));
		clickElement(location);
		clickElement(login);
		validation(invaliderror.getText(), data.getDataProperty("invaliderror"));
		return true;
	}

	public boolean WithoutClickingLocation() throws IOException {
		OpenMrsFileReaderManager data = new OpenMrsFileReaderManager();
		launchUrl(data.getDataProperty("url"));
		passInput(username, data.getDataProperty("lnusername"));
		passInput(password, data.getDataProperty("lnpassword"));
//		clickElement(location);
		clickElement(login);
		validation(locationNotSelected.getText(), data.getDataProperty("locationerror"));
		return true;
	}
}
