package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;
import com.interfaceElements.interfaceElements;
import com.srcmainresource.FileReaderManager;

public class SearchHotelModel extends BaseClass implements interfaceElements{

	@FindBy(id = location_id)
	private WebElement location;
	
	@FindBy(id = hotels_id)
	private WebElement hotels;
	
	@FindBy(id =  roomtype_id)
	private WebElement roomtype;
	
	@FindBy(name = numrooms_name)
	private WebElement roomnos;
	
	@FindBy(id = checkinDate_id)
	private WebElement inDate;

	@FindBy(id = checkOutDate_id)
	private WebElement outDate;
	
	@FindBy(id = adultsPerRoom_id)
	private WebElement adult;
	
	@FindBy(id = childRoom_id)
	private WebElement child;
	
	@FindBy(id = searchButton_id)
	private WebElement submit;
	
	@FindBy(name = radiobtn_name )
	private WebElement radio;
	
	@FindBy(id = continue_id)
	private WebElement continu;
	
	public SearchHotelModel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public void searchHotel() throws IOException {
		FileReaderManager values = new FileReaderManager();
		selectByVisibleText(location, values.getDataProperty("location"));
		selectByVisibleText(hotels, values.getDataProperty("hotels"));
		selectByVisibleText(roomtype, values.getDataProperty("roomtype"));
		selectByVisibleText(roomnos, values.getDataProperty("nrooms"));
		passDate(inDate, values.getDataProperty("cidate"));
		passDate(outDate, values.getDataProperty("codate"));
		selectByVisibleText(adult, values.getDataProperty("adults"));
		selectByVisibleText(child, values.getDataProperty("children"));
		clickElement(submit);
		clickElement(radio);;
		clickElement(continu);
		
	}
	
}
