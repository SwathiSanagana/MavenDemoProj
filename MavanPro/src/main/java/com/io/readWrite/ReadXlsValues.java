package com.io.readWrite;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadXlsValues {
	
	public static void main(String[] args) throws Exception {
		
		File src=new File("D:\\selenium\\selenium dumps\\Exceldata\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String Data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		
		String Data1=sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("staeet value " +Data0  +Data1);
		wb.close();
		
	}

}
