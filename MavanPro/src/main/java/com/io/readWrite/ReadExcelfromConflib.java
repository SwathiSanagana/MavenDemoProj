package com.io.readWrite;
import com.io.readWrite.ReadExcelConfLib;
public class ReadExcelfromConflib {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ReadExcelConfLib excel=new ReadExcelConfLib("D:\\selenium\\selenium dumps\\Exceldata\\TestData.xlsx");
		System.out.println(excel.getData(0, 0, 0));
	}

}
