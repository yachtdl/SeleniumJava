package utils;

public class ExcelUtilsDemo {
    public static void main(String[] args) {
        String filePath="/excel/Book3.xlsx";
        ExcelUtils excel=new ExcelUtils(filePath,"Sheet1");
        excel.getRowCount();
        excel.getCeilString(1,2);
        excel.getCeilNumber(1,1);
    }
}
