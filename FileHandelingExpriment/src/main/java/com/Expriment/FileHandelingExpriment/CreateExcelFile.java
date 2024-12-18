package com.Expriment.FileHandelingExpriment;


import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

class CreateExcelFile {
	public static void createExcelFile() throws IOException {
		
		String str = "Faysal";
		// create a workbook
		Workbook wb = new HSSFWorkbook();
		
		// create a location where file will be created 
		/*FileOutputStream fos = new FileOutputStream("ExcelFile.xlx");*/
		
		// create a sheet cause there is nothing that you can write into 
		Sheet sheet = wb.createSheet("Monday");
		
		// now create Row so that you can write data
		// you create row but where will you keep your data 
		// row will be in sheet object 
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		
		cell.setCellValue(str);
//		  for(int i =0; i<str.length();i++) 
//		  { 
//			  cell.setCellValue(str); 
//		  }
		 
		// you create wb then file location then sheet to keep data then row to attatch with sheet 
		// now time to give the sheet what he need.. the data 
//		for(int i= 0; i < str.length(); i++) {
//			// but you did not create cell 
//			// where data will be kept?
//			Cell cell = row.createCell(i);
//			
//			// you created everything but how to implement 
//			cell.setCellValue(String.valueOf(str.charAt(i)));
//		}
		
		// create file output
		FileOutputStream fos = new FileOutputStream("ExcelFile.xls");
		wb.write(fos);
		
		System.out.println("File created successfully");
		
		// workbook created and file too
		// now there is input you need to put it in
		//wb.write(fos);
//		fos.close();
		wb.close();
		
		
		
	}
}
