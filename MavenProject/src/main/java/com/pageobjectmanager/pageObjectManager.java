package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.pageobjectmodel.AdactinLoginPage;
import com.pageobjectmodel.BookHotelPage;
import com.pageobjectmodel.SearchHotelModel;
import com.srcmainresource.FileReaderManager;

public class pageObjectManager extends BaseClass{
	private FileReaderManager fileReader;
	private AdactinLoginPage loginPage;
	private SearchHotelModel searchHotelModel;
	private BookHotelPage bookHotelPage;
	public FileReaderManager getFileReader() {
		if(fileReader == null) {
			fileReader = new FileReaderManager();
		}
		return fileReader;
	}
	public AdactinLoginPage getLoginPage() {
		if(loginPage == null) {
			loginPage = new AdactinLoginPage(driver);
			
		}
		return loginPage;
	}
	public BookHotelPage getBookHotelPage() {
		if(bookHotelPage == null) {
			bookHotelPage = new BookHotelPage(driver);
					
		}
		
		return bookHotelPage;
	}
	public SearchHotelModel getSearchHotelModel() {
		if(searchHotelModel == null) {
			searchHotelModel = new SearchHotelModel(driver);
		}
		return searchHotelModel;
	}
	
	
	
	
	
	
}
