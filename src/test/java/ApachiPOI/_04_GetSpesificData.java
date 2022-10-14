package ApachiPOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *   Verilen Exceldeki password bilgisini bir metoda aracılığı bularak yazdırınız,
 *   yani metoda "password" kelimesi gönderilecek, dönen değr password un kendisi olacak.
 *   src/test/java/ApachePOI/resources/LoginData.xlsx
 **/

public class _04_GetSpesificData {
    public static void main(String[] args){

        System.out.print("Aranacak kelime = ");
        Scanner oku = new Scanner(System.in);
        String arananKelime = oku.next();

        String donenSonuc = Bul(arananKelime);
        System.out.println("donenSonuc = " + donenSonuc);

    }
    public static String Bul(String arananKelime) {

        String donecek = "";

        String path = "src/test/java/ApachiPOI/resources/LoginData.xlsx";

        Workbook workbook = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet login = workbook.getSheetAt(0);   // "0" = "Login"

        for (int i = 0; i < login.getPhysicalNumberOfRows(); i++) {
            Row row = login.getRow(i);
            Cell cell = row.getCell(0);

            if (cell.toString().equalsIgnoreCase(arananKelime)) {

                for (int j = 1; j < row.getPhysicalNumberOfCells(); j++) {

                    donecek += row.getCell(j) + " ";
                }
            }
        }
        return donecek;


    }
}