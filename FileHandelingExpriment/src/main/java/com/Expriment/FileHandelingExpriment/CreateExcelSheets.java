package com.Expriment.FileHandelingExpriment;


import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

class CreateExcelSheets {
	public static void createExcelSheets() throws IOException{
		// create a workbook 
		Workbook wb = new HSSFWorkbook();
		
		// create sheets
		Sheet sheet1 = wb.createSheet("Saturday");
		Sheet sheet2 = wb.createSheet("Sunday");
		//Sheet sheet3 = wb.createSheet("Monday");
		
		// every sheets sheet1 need row
		Row row1 = sheet1.createRow(0);
		Row row2 = sheet1.createRow(1);
		Row row3 = sheet1.createRow(2);
		
		// sheet1 row 1
		Cell cell1 = row1.createCell(0);
		Cell cell2 = row1.createCell(1);
		Cell cell3 = row1.createCell(2);
		
		//sheet 1 row 2
		Cell cell4 = row2.createCell(0);
		Cell cell5 = row2.createCell(1);
		Cell cell6 = row2.createCell(2);
		
		// sheet 1 row 3
		Cell cell7 = row3.createCell(0);
		Cell cell8 = row3.createCell(1);
		Cell cell9 = row3.createCell(2);
		
		//row = 0 cell value sheet 1
		cell1.setCellValue("Name");
		cell2.setCellValue("Age");
		cell3.setCellValue("Height");
		
		// row = 1 cell value sheet 1
		cell4.setCellValue("Faysal Ahmed");
		cell5.setCellValue("25");
		cell6.setCellValue("6.0");
		
		//row = 2 cell value sheet 1
		cell7.setCellValue("Russell");
		cell8.setCellValue("24");
		cell9.setCellValue("6'1");
		
		
		// for sheet2
		Row row4 = sheet2.createRow(0);
		Row row5 = sheet2.createRow(1);
		Row row6 = sheet2.createRow(2);
		
		//row = 0 in sheet2
		Cell cell20 = row4.createCell(0);
		Cell cell21 = row4.createCell(1);
		Cell cell22 = row4.createCell(2);
		
		// row = 1 in sheet2
		Cell cell23 = row5.createCell(0);
		Cell cell24 = row5.createCell(1);
		Cell cell25 = row5.createCell(2);
		
		// row = 2 in sheet 2
		Cell cell26 = row6.createCell(0);
		Cell cell27 = row6.createCell(1);
		Cell cell28 = row6.createCell(2);
		
		//row = 0 sheet 2
		cell20.setCellValue("Name");
		cell21.setCellValue("Age");
		cell22.setCellValue("Height");
		
		//row = 1 sheet 2
		cell23.setCellValue("Humaira");
		cell24.setCellValue("9");
		cell25.setCellValue("4.0");
		
		// row = 2 sheet 2
		cell26.setCellValue("Razia");
		cell27.setCellValue("28");
		cell28.setCellValue("4'9");
		
		// two sheets are created 
		// their row and cell been declared 
		// now save them in file output
		FileOutputStream fos = new FileOutputStream("ExcelSheets.xls");
		
		// success message 
		System.out.println("File Created successfully");
		// write file 
		wb.write(fos);
		fos.close();
		wb.close();
	}
}
