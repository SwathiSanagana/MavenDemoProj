package com.io.readWrite;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExceldataMultiColl2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      File src=new File("D:\\selenium\\selenium dumps\\Exceldata\\TestData.xlsx");
      FileInputStream fis=new FileInputStream(src);
      XSSFWorkbook wb=new XSSFWorkbook(fis);
      XSSFSheet sheet1=wb.getSheetAt(0);
      int rowcount=sheet1.getLastRowNum();
      System.out.println(+rowcount);
      
      for(int i=0;i<rowcount;i++)
      {
    	  String Data0=sheet1.getRow(i).getCell(0).getStringCellValue();
    	  String Data1=sheet1.getRow(i).getCell(1).getStringCellValue();
    	  System.out.println("Data from" +i+ "is row value "  +Data0+ " " +Data1);
      }
      wb.close();
	}

}
