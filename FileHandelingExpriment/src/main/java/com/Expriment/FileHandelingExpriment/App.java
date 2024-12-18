package com.Expriment.FileHandelingExpriment;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	// only created a excell sheet and give it a string data 
        //CreateExcelFile.createExcelFile();
    	
    	// create multiple sheets and give them data 
    	//CreateExcelSheets.createExcelSheets();
    	
    	//reading the excel (.xls) file 
    	//ReadExcelSheet.readExcelSheet();
    	
    	//reading the excel (.xlsx) file 
    	Read_xlsx_File.read_XLSX_File();
    }
}
