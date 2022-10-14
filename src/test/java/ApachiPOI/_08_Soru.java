package ApachiPOI;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

// /  Soru 1:
//         *  Çarpım tablosunu excele yazdırınız.
//         *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
//         *  sıfırdan excel oluşturarak.
//         *  her bir onluktan sonra 1 satır boşluk bırakarak alt alata
//         */
//
//         /  Soru 2:
//         *  Çarpım tablosunu excele yazdırınız.
//         *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
//         *  sıfırdan excel oluşturarak.
//         *  her bir onluktan sonra 1 kolon boşluk bırakarak yan yana
//         */
public class _08_Soru {
    public static void main(String[] args) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("HEEEY");

        Row row = sheet.createRow(0);



        String newPath = "src/test/java/ApachiPOI/resources/01ExcelFile.xlsx";

        try {
            FileOutputStream outputStream = new FileOutputStream(newPath);
            workbook.write(outputStream);
            workbook.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("İşlem Tamamlandı");

    }
}
