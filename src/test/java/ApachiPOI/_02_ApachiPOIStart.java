package ApachiPOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _02_ApachiPOIStart {
    public static void main(String[] args) throws IOException {

        String path = "src/test/java/ApachiPOI/resources/ApacheExcel2.xlsx";

        FileInputStream dosyanOkumaBaglantisi = new FileInputStream(path);

        Workbook calismaKitabi = WorkbookFactory.create(dosyanOkumaBaglantisi);

        Sheet calismaSayfasi = calismaKitabi.getSheet("Sheet1");

        Row satir = calismaSayfasi.getRow(3);

        Cell hucre = satir.getCell(0);

        System.out.println(hucre);


    }
}
