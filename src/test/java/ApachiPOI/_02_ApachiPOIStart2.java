package ApachiPOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _02_ApachiPOIStart2 {
    public static void main(String[] args) throws IOException {

        String path = "src/test/java/ApachiPOI/resources/ApacheExcel2.xlsx";

        FileInputStream dosyaOkumaBaglantisi = new FileInputStream(path);

        Workbook calismaKitabi = WorkbookFactory.create(dosyaOkumaBaglantisi);

        Sheet calismaSayfasi = calismaKitabi.getSheet("testCitizen");

        Row satir = calismaSayfasi.getRow(0);

        Cell hucre = satir.getCell(0);

        System.out.println("CELL0 : " + hucre);



        String path1 = "src/test/java/ApachiPOI/resources/ApacheExcel2.xlsx";

        FileInputStream dosyaOkutan = new FileInputStream(path1);

        Workbook dosyayiAcan = WorkbookFactory.create(dosyaOkutan);

        Sheet calisilanSayfa = dosyayiAcan.getSheet("testCitizen");

        Row satir1 = calisilanSayfa.getRow(1);

        Cell hucre1 = satir1.getCell(0);

        System.out.println("CELL1 : " + hucre1);



        String path2 = "src/test/java/ApachiPOI/resources/LoginData.xlsx";
        FileInputStream dosyaOkutma = new FileInputStream(path2);
        Workbook dosyayiCalistiran  = WorkbookFactory.create(dosyaOkutma);
        Sheet acilanSayfa = dosyayiCalistiran.getSheet("Login");
        Row satir2 = acilanSayfa.getRow(2);
        Cell hucre2 = satir2.getCell(0);
        System.out.println("CELL2 : " + hucre2);

        String path3 = "src/test/java/ApachiPOI/resources/LoginData.xlsx";
        FileInputStream fileScan = new FileInputStream(path3);
        Workbook fileWorker = WorkbookFactory.create(fileScan);
        Sheet fileOpen = fileWorker.getSheet("Login");
        Row satir3 = fileOpen.getRow(3);
        Cell hucre3 = satir3.getCell(0);
        System.out.println("CELL3 : " + hucre3);

    }
}
