package com.Expriment.FileHandelingExpriment;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

class ReadExcelSheet {
	public static void readExcelSheet() throws IOException {
		// to read excel file first need the file 
		// FileInputSteam to grab file 
		FileInputStream fis = new FileInputStream("ExcelSheets.xls");
		
		// file been selected but 
		// file need to excess by programmer 
		// initially programmer interact FileOutputSteam object  with workbook
		HSSFWorkbook hwb = new HSSFWorkbook(fis);
		
		// workbook created 
		// workbook will now excess the FileOutputSteam object 
		// inside xlx file we have sheets
		// but sheets at what? we need getSheetAt()
		HSSFSheet sheet = hwb.getSheet("Saturday");
		
		// file located 
		// workbook intertact with file 
		//and sheet been located in workbook 
		//now time to work with cell type
		// Row is not mentioned yet it will come after it 
		// FormulaEvaluator for helper 
		FormulaEvaluator formulaEvaluator = hwb.getCreationHelper().createFormulaEvaluator();
		
		// now time to interact with Row 
		// using for loop 
		// my row will interact with what?
		// it interact with sheet 
		for(Row row: sheet) {
			//row object interact with sheet 
			//time to use cell 
			// cell data need to collect .. right?
			// cell do not interact with sheet it interact with row 
			for(Cell cell : row) {
				//now how it retrive data from cell
				//using switch case 
				// use formula to get cell from the sheet
				switch(formulaEvaluator.evaluateInCell(cell).getCellType()) {
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()+ "\t");
					break;
				case STRING:
					System.out.print(cell.getStringCellValue()+ "\t\t\t");
					break;
				default:
					System.out.println("Unknown Cell type");
					break;
				}
			}
			hwb.close();
			System.out.println();
		}
	}
}
