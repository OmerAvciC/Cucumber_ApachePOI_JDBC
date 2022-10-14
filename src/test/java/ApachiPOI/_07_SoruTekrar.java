package ApachiPOI;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _07_SoruTekrar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("İstenilen sütun");
        int column = sc.nextInt();

        String donenSonuc = Bul(column);
        System.out.println("donenSonuc = " + donenSonuc);

    }
    public static String Bul(int column){

        String donecek ="";
        String path = "src/test/java/ApachiPOI/resources/ApacheExcel2.xlsx";


        Workbook workbook = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sheet = workbook.getSheetAt(0);

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            donecek+=sheet.getRow(i).getCell(column) + "\n";
        }


        return donecek;
    }
}
