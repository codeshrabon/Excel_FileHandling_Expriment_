package com.Expriment.FileHandelingExpriment;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class Read_xlsx_File {
	public static void read_XLSX_File() throws IOException {
		//firstly we need a file 
		FileInputStream fis = new FileInputStream("4BeatsAssignment.xlsx");
		
		// file need to store in workbook...
		// for further work
		XSSFWorkbook xwb = new XSSFWorkbook(fis);
		
		// workbook done and file also done
		//time to work with sheets
		XSSFSheet sheet = xwb.getSheetAt(0);
		
		//iterate help to loop through all the rows in side the sheet 
		Iterator<Row> iterator = sheet.iterator();
		
		//not time to check if there is has any rows in it
		// using while 
		// it is a best practice 
		while (iterator.hasNext()) {
			Row row = iterator.next();
			
			// row is iterated
			// time to iterate with cell
			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				
				// we have row and cell iterated 
				// tiime to check what type of data this cell have
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue() + "\t");					
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + "\t");
					break;

				default:
					System.out.print("Unknown type " + "\t");
					break;
				}
			}
			System.out.println();
			xwb.close();
		}
	}
}
