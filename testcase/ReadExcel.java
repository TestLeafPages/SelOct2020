package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String sheetName) throws IOException {
		// to get into the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/test.xlsx");

		// to get into the Worksheet using name
		XSSFSheet sheet = wb.getSheet(sheetName);

		// to get into sheeet using index
		// wb.getSheetAt(0);

		// to get the number of rows
		int rowCount = sheet.getLastRowNum();

		short cellCount = sheet.getRow(0).getLastCellNum();

		
		// int rowCount = sheet.getPhysicalNumberOfRows(); // to get the count including header
		
		//declare 2D array 
		String[][] data = new String[rowCount][cellCount];
		

		for (int i = 1; i <= rowCount; i++) {

			for (int j = 0; j < cellCount; j++) {

				String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				
				//0,0
				data[i-1][j] = cellValue;

				
			}

		}

		/*
		 * //to get into the row XSSFRow row = sheet.getRow(0);
		 * 
		 * //to get into the cell XSSFCell cell = row.getCell(0);
		 * 
		 * //to read the data String cellValue = cell.getStringCellValue();
		 * System.out.println(cellValue);
		 */

		// to close the workbook
		wb.close();
		
		return data;
	}

}
