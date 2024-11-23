package com.TestRunner;

import java.io.IOException;

import com.baseclass.BaseClass;
import com.pageobjectmanager.pageObjectManager;

public class TestRunner extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		pageObjectManager page = new pageObjectManager();
		launchBrowser(page.getFileReader().getDataProperty("browser"));
		launchUrl(page.getFileReader().getDataProperty("url"));
		page.getLoginPage().validUserNameAndValidPassword();
		page.getSearchHotelModel().searchHotel();
		page.getBookHotelPage().bookHotelpage();
		
		
	}

}
