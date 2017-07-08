package com.example.excel;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Excel {
	public static void main(String[] args){
		// Workbook 생성
		Workbook xlsWb = new HSSFWorkbook(); // Excel 2007이전 버전
		//Workbook xlsxWb = new XSSFWorkbook(); // Excel 2007 이상
		
		
		/** sheet **/
		// Sheet 생성
		Sheet sheet1 = xlsWb.createSheet("단가리스트");
		
		// 컬럼 너비 설정..?
		
		/** style 설정 **/
		// Cell 스타일 생성
		CellStyle cellStyle = xlsWb.createCellStyle();
		
		// 줄바꿈
		cellStyle.setWrapText(true);
		
		// Cell 색깔, 무늬 채우기
		cellStyle.setFillForegroundColor(HSSFColor.AQUA.index);
		cellStyle.setFillPattern(CellStyle.ALIGN_CENTER);
		
		Row row = null;
		Cell cell = null;
		
		// 첫번째 줄
		row = sheet1.createRow(0);
		
		// 첫번째 줄에 Cell 설정
		cell = row.createCell(0);
		cell.setCellValue("1-1");
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(1);
		cell.setCellValue("1-2");
		
		cell = row.createCell(2);
		cell.setCellValue("1-3 Test");
		
		 // 두 번째 줄
		row = sheet1.createRow(1);
        
        // 두 번째 줄에 Cell 설정하기-------------
        cell = row.createCell(0);
        cell.setCellValue("2-1");
         
        cell = row.createCell(1);
        cell.setCellValue("2-2");
         
        cell = row.createCell(2);
        cell.setCellValue("2-3");
        
        try{
        	File xlsFile = new File("C:/testExcel.xls");
        	FileOutputStream fileOut = new FileOutputStream(xlsFile);
        	xlsWb.write(fileOut);
        }catch(Exception e){
        	e.printStackTrace();
        }
		
		
	}
}
