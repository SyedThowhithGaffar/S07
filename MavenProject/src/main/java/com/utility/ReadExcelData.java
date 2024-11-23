package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelData {

	public static void readParticularCellData() throws InvalidFormatException, IOException {
		File file = new File("C:\\Users\\syedt\\OneDrive\\Desktop\\DataDriven.xlsx");
		Workbook book = new XSSFWorkbook(file);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(2);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);

	}
	public static void main(String[] args) throws InvalidFormatException, IOException {
		readParticularCellData();
	
	}}


