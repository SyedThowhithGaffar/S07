package com.pageobjectmanager;

import com.baseclass.BaseClass;
import com.pageobjectmodel.OpenMrsPageObjectModel;
import com.srcmainresource.OpenMrsFileReaderManager;

public class OpenMrsPageObjectManager extends BaseClass {

	private OpenMrsFileReaderManager fileReader;
	private OpenMrsPageObjectModel loginPage;

	public OpenMrsFileReaderManager getFileReader() {

		if (fileReader == null) {
			fileReader = new OpenMrsFileReaderManager();
		}
		return fileReader;
	}

	public OpenMrsPageObjectModel getLoginPage() {
		loginPage = new OpenMrsPageObjectModel(driver);
		return loginPage;
	}

}
