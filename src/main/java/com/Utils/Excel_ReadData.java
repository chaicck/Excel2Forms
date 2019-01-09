package com.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Excel_ReadData{
	
	WebDriver driver;
	File file;
	FileInputStream input ;
	Workbook wb;
	Sheet sh;
	
	public void readData(File file, String sheet) throws IOException {
		
		input = new FileInputStream(file);
		wb = new XSSFWorkbook(input);
		sh=wb.getSheet(sheet);
		int rc = sh.getLastRowNum()-sh.getFirstRowNum();		
		System.out.println(rc);
		for(int i=1; i<rc+1; i++) {
			Row row = sh.getRow(i);
			//System.out.println(row);
			for(int j=0; j<row.getLastCellNum(); j++) {
				 
				String Question = row.getCell(j).getStringCellValue();
				String Option1 = row.getCell(j+1).getStringCellValue();
				String Option2 = row.getCell(j+2).getStringCellValue();
				String Option3 = row.getCell(j+3).getStringCellValue();
				String Option4 = row.getCell(j+4).getStringCellValue();
//				System.out.println(Question);
//				System.out.println(Option1);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		File file1 = new File("E:\\Test_123.xlsx");
		Excel_ReadData erd = new Excel_ReadData();
		erd.readData(file1, "Sheet1");
	}
	

}
