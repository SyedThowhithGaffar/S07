package com.pageobjectmodel;

import java.io.FileReader;
import java.io.IOException;
import java.net.http.WebSocket;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;
import com.interfaceElements.interfaceElements;
import com.srcmainresource.FileReaderManager;

public class BookHotelPage extends BaseClass implements interfaceElements {
	
	

	@FindBy(id=firstName_id)
	private WebElement firstName;
	
	@FindBy(id=lastname_id)
	private WebElement lastname;
	
	@FindBy(id=billingaddress_id)
	private WebElement billingaddress;
	
	@FindBy(id=creditcard_id)
	private WebElement creditcard;
	
	@FindBy(name=cctype_name)
	private WebElement cctype;
	
	@FindBy(name=selectmonth_name)
	private WebElement selectmonth;
	
	@FindBy(id=selectyear_id)
	private WebElement selectyear;
	
	@FindBy(name=cvv_name)
	private WebElement cvvname;
	
	@FindBy(name=booknow_name)
	private WebElement booknow;
	
	@FindBy(name = logout_name)
	private WebElement logout;
	
	
	public BookHotelPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void bookHotelpage() throws IOException {
		FileReaderManager data = new FileReaderManager();
		implicitWait(30);
		passInput(firstName, data.getDataProperty("firstname") );
		passInput(lastname, data.getDataProperty("lastname"));
		passInput(billingaddress, data.getDataProperty("billingaddress"));
		passInput(creditcard, data.getDataProperty("creditcardno"));
		selectByVisibleText(cctype, data.getDataProperty("creditcardtype"));
		selectByVisibleText(selectmonth, data.getDataProperty("expirymonth"));
		selectByVisibleText(selectyear, data.getDataProperty("expiryyear"));
		passInput(cvvname, data.getDataProperty("cvvnumber"));
		clickElement(booknow);
		explicitWait(booknow, 30);
		scrollDown();
		takesScreenshot(data.getDataProperty("filepath"));
		clickElement(logout);
		
	}
}
