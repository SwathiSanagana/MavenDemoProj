package com.io.readWrite;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelConfLib {
	XSSFSheet sheet1;
	XSSFWorkbook wb;
	public ReadExcelConfLib(String excelpath)
	{
	
		try {
			File src=new File(excelpath);
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		

	}

	public String getData(int sheetNumber,int row,int cell)
	{
		sheet1=wb.getSheetAt(sheetNumber);
		String Data=sheet1.getRow(row).getCell(cell).getStringCellValue();
		return Data;
	}
	

}
