package com.rcv.rwxls;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 

public class WriteDataToXls {
	
	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook.createSheet("Sheet1");
		
		
		Row r0 = sheet1.createRow(0);
		Cell c0 = r0.createCell(0);
		c0.setCellValue("RCV Academy");
				
		Row r1 = sheet1.createRow(1);
		Cell c1 = r1.createCell(1);
		c1.setCellValue("RCV");
		
		Row r2 = sheet1.createRow(2);
		Cell c2 = r2.createCell(2);
		c2.setCellValue("selenium");

		Row r3 = sheet1.createRow(3);
		Cell c3 = r3.createCell(3);
		c3.setCellValue("Automation");
		
		
		//Sheet2 in same workbook
	
		XSSFSheet sheet2 = workbook.createSheet("Sheet2");
		
		Row r00 = sheet2.createRow(0);
		Cell c00 = r00.createCell(0);
		c00.setCellValue("Sheet00");
		
		Row r01 = sheet2.createRow(1);
		Cell c01 =r01.createCell(1);
		c01.setCellValue("Sheet11");
		
		Row r02 = sheet2.createRow(2);
		Cell c02 = r02.createCell(2);
		c02.setCellValue("Sheet22");
	
		Row r03 = sheet2.createRow(3);
		Cell c03 = r03.createCell(3);
		c03.setCellValue("Sheet33");
		
		Row r04 = sheet2.createRow(4);
		Cell c04 = r04.createCell(3);
		c04.setCellValue("Sheet43");
		
		Row r05 = sheet2.createRow(3);
		Cell c05 = r05.createCell(1);
		c05.setCellValue("Sheet31");
		
		File f = new File("C:\\Users\\sagar\\eclipse-workspace\\RWXlsFiles\\src\\com\\rcv\\data\\TestData.rwxls");
        FileOutputStream fos = new FileOutputStream(f);
        
		workbook.write(fos);
		fos.close();
		workbook.close();
		
		System.out.println("File is written successfully!");
		
	}
	

}
