package ApachiPOI;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_carpimTablosu {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();                 //excel i olusturduk
        Sheet sheet = workbook.createSheet("Sayfa1");    //sayfa olusturduk

        for (int i=0;i<11;i++){
            Row newRow = sheet.createRow(i);                        //satir olusturduk
            for (int j=0;j<11;j++){

                int j6 = 0 ;
                newRow.createCell((j6)).setCellValue((i));          //hucre olusturduk ve hucreye veri yazdik
                newRow.createCell((j6)+1).setCellValue("");    // her sey hafizada olusturuldu.beklemede
                newRow.createCell((j6)+2).setCellValue(j);
                newRow.createCell((j6)+3).setCellValue("=");
                newRow.createCell((j6)+4).setCellValue((i)*(j));
                
            }
        }

        String sifirdanExcelDosyasi2 = "src/test/java/ApachiPOI/resources/WriteInTheExcelFile02.xlsx";//excel i nereye hangi isimle kaydedecegimizi belirledik
        FileOutputStream outputStream = new FileOutputStream(sifirdanExcelDosyasi2);  // run yapinca olusturuldu
        workbook.write(outputStream);                                                 // hafizada bekleyen bilgiler excel e yazdirildi
        workbook.close();                                                             //excel kapatildi
        outputStream.close();                                                         //hafizadan akis bitirildi.
        System.out.println("islem tamamlandi");

    }
    
    
}
  
  
   
   