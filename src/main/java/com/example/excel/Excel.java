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
		// Workbook ����
		Workbook xlsWb = new HSSFWorkbook(); // Excel 2007���� ����
		//Workbook xlsxWb = new XSSFWorkbook(); // Excel 2007 �̻�
		
		
		/** sheet **/
		// Sheet ����
		Sheet sheet1 = xlsWb.createSheet("�ܰ�����Ʈ");
		
		// �÷� �ʺ� ����..?
		
		/** style ���� **/
		// Cell ��Ÿ�� ����
		CellStyle cellStyle = xlsWb.createCellStyle();
		
		// �ٹٲ�
		cellStyle.setWrapText(true);
		
		// Cell ����, ���� ä���
		cellStyle.setFillForegroundColor(HSSFColor.AQUA.index);
		cellStyle.setFillPattern(CellStyle.ALIGN_CENTER);
		
		Row row = null;
		Cell cell = null;
		
		// ù��° ��
		row = sheet1.createRow(0);
		
		// ù��° �ٿ� Cell ����
		cell = row.createCell(0);
		cell.setCellValue("1-1");
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(1);
		cell.setCellValue("1-2");
		
		cell = row.createCell(2);
		cell.setCellValue("1-3 Test");
		
		 // �� ��° ��
		row = sheet1.createRow(1);
        
        // �� ��° �ٿ� Cell �����ϱ�-------------
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
