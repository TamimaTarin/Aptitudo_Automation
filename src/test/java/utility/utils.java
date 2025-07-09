package utility;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class utils {
    public static String getCellData(String sheetName, int rowNum, int colNum) {
        try {
        	FileInputStream fis = new FileInputStream("src/test/java/resources/testdata/TestData.xlsx");
            Workbook workbook = new XSSFWorkbook(fis); // <- close workbook after try block

            Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(rowNum);
            if (row == null) {
                throw new IllegalArgumentException("Row " + rowNum + " not found in sheet " + sheetName);
            }

            Cell cell = row.getCell(colNum);
            if (cell == null) {
                throw new IllegalArgumentException("Cell not found at row " + rowNum + ", column " + colNum);
            }

            DataFormatter formatter = new DataFormatter();
            String data = formatter.formatCellValue(cell);  // formats number cells nicely without ".0"
            
            return data;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
