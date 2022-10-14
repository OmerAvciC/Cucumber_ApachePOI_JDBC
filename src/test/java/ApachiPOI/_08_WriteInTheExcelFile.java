package ApachiPOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_WriteInTheExcelFile {
    public static void main(String[] args) throws IOException {
        // Var olan bir EXCEL yazma işlemi
        String path = "src/test/java/ApachiPOI/resources/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream = new FileInputStream(path); // okuma modunda açıldı
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet("Sheet1");

        // HAFIZADA oluşturma ve yazma işlemelri yapılıyor
        Row yeniSatir = sheet.createRow(0); // satır oluşturuldu 0.yerde
        Cell yeniHucre = yeniSatir.createCell(0); // yeni satırda ilk hucre oluşturuldu
        yeniHucre.setCellValue("Merhaba Dünya"); // bilgi yazıldı.

        for (int i = 1; i < 10; i++) {
            yeniSatir.createCell(i).setCellValue(i);
        }

        // sıra kaydetmeye geldi, bütün bilgiler hafızada buraya kadar, her şey WORKBOOK da
        inputStream.close(); // okuma modunu kapattım, çünkü yazma modunda açmam gerekiyor


        // Yazma işlemini YAZMA modunda açıp öyle yapacağız.
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();  // hafıza boşaltıldı
        outputStream.close();
        System.out.println("işlem tamamlandı");
    }
}
