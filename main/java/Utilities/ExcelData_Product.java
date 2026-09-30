package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData_Product {

    public static Object[][] getExcelData(String path, String sheetName) throws IOException {

        FileInputStream file = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        Sheet sheet = workbook.getSheet(sheetName);

        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[rowCount - 1][colCount];

        for (int r = 1; r < rowCount; r++) {

            Row row = sheet.getRow(r);

            for (int c = 0; c < colCount; c++) {
                data[r - 1][c] = row.getCell(c).toString();
            }
        }

        workbook.close();
        file.close();

        return data;
    }
}
