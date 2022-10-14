package ApachiPOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _03_ApachiPOIGetAllData {
    public static void main(String[] args) throws IOException {


        String path = "src/test/java/ApachiPOI/resources/ApacheExcel2.xlsx";

        FileInputStream inputStream = new FileInputStream(path);

        Workbook calismaKitabi = WorkbookFactory.create(inputStream);

        Sheet sheet = calismaKitabi.getSheet("Sheet1");

        int satirSayisi = sheet.getPhysicalNumberOfRows();

        System.out.println(satirSayisi);
        System.out.println("--------------------------");

        for (int i = 0; i < satirSayisi; i++) {

            Row satir = sheet.getRow(i); //Bütün satırlara gidiliyor
            int hucreSayisi = satir.getPhysicalNumberOfCells(); //Her satirdaki hücre sayisi alindi

            for (int j = 0; j < hucreSayisi; j++) { //i.ninci satirdaki hucre sayısı kadar dönecek

                Cell hucre = satir.getCell(j);  // bu satırdaki sıradaki hucreyi alalım
                System.out.println(hucre+" ");
            }
            System.out.println();
        }
    }
}
