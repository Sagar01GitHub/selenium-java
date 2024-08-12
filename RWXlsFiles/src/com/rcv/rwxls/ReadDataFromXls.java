package com.rcv.rwxls;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadDataFromXls {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File f = new File("C:\\Users\\sagar\\eclipse-workspace\\RWXlsFiles\\src\\com\\rcv\\data\\TestData2.rwxls");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet0 = wb.getSheetAt(0);
				
		Row row0 = ((org.apache.poi.ss.usermodel.Sheet) sheet0).getRow(0);
		Cell cell0 =row0.getCell(0);
		
		Row row1 = sheet0.getRow(1);
		Cell cell1 = row1.getCell(1);
		
		Row row2 = sheet0.getRow(2);
		Cell cell2 = row2.getCell(2);
		
		Row row3 = sheet0.getRow(3);
		Cell cell3 = row3.getCell(3);
		
		
		System.out.println(cell0);
		System.out.println(cell1);
		System.out.println(cell2);
		System.out.println(cell3);
		
		fis.close();
	}

}
