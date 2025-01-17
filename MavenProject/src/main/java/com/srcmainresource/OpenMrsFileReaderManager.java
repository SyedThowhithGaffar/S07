package com.srcmainresource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class OpenMrsFileReaderManager {
	private static Properties property;
	private static FileInputStream fileInputStream;

	private static void setUpProperty() throws IOException {
		if (property == null) {

			File file = new File(
					"C:\\Users\\syedt\\eclipse-workspace\\MavenProject\\src\\main\\java\\com\\srcmainresource\\OpenMrsData.properties");
			try {
				fileInputStream = new FileInputStream(file);
				property = new Properties();
				property.load(fileInputStream);
			} catch (FileNotFoundException e) {
				Assert.fail("ERROR : OCCURRED DUE TO LOADING OF PROPERTY FILE");
			} catch (Exception e) {
				Assert.fail("ERROR : OCCURRED DUE TO READING OF PROPERTY FILE");
			}
		}
	}

	public static String getDataProperty(String dataValue) throws IOException {
		setUpProperty();
		String syed = property.getProperty(dataValue);
		return syed;
	}

}
