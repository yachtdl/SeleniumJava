package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
    static String path = System.getProperty("user.dir");
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;

    public ExcelUtils(String filePath, String sheetName) {
        try {
            workbook = new XSSFWorkbook(path + filePath);
            sheet = workbook.getSheet(sheetName);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public int getRowCount() {
        int rowCount = sheet.getPhysicalNumberOfRows();
        //System.out.println(rowCount);
        return rowCount;
    }

    public int getColCount(){
        int colCount=sheet.getRow(1).getPhysicalNumberOfCells();
        //System.out.println(colCount);
        return colCount;
    }

    public String getCeilString(int row, int col) {
        String name = sheet.getRow(row).getCell(col).getStringCellValue();
        //System.out.println(name);
        return name;
    }

    public double getCeilNumber(int row, int col) {
        double password = sheet.getRow(row).getCell(col).getNumericCellValue();
        //System.out.println(password);
        return password;
    }
}
