package ApachiPOI;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _10_NewExcelWrite {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("PAGE01");

        Row row = sheet.createRow(0);

        for (int i = 0; i < 10; i++) {
            row.createCell(i).setCellValue("Attempt");
        }

        String newExcelPath = "src/test/java/ApachiPOI/resources/nupNewExcelFile.xlsx";

        FileOutputStream outputStream = new FileOutputStream(newExcelPath);
        workbook.write(outputStream);

        workbook.close();

        outputStream.close();

        System.out.println("İşlem Tamam");


    }
}
