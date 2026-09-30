package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData_Login {

	public static Object[][] getExcelData(String path, String sheetName) throws IOException{
		
		FileInputStream file = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		Sheet sheet = workbook.getSheet(sheetName);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		
		Object[][] data = new Object[rowCount - 1][2];
		
		for(int r = 1; r < rowCount; r++) {
			Row row = sheet.getRow(r);
			
			data[r - 1][0] = row.getCell(r).toString();
			data[r - 1][1] = row.getCell(r).toString();
		}
		
		file.close();
		workbook.close();
		
		return data;
	}
}
