package com.TruckNet.GenericUtilites;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XlsxUtilis {

	public String readExcel(String userInput) throws IOException {

		String data=null;
		String value=null;

		FileInputStream fis=new FileInputStream(FilepathInstanceTest.excelData);

		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("Sheet1");

		int col=0;
		int row=sheet.getLastRowNum();
		
		//System.out.println(row);

		for (int i = 0; i < row; i++) {

			data=sheet.getRow(i+1).getCell(col).toString();
			if (data.equalsIgnoreCase(userInput)) {
				value=sheet.getRow(i+1).getCell(col+1).toString();
				break;
			}
		}
		return value;
	}
	
}
