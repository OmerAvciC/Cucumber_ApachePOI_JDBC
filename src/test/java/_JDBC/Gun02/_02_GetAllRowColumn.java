package _JDBC.Gun02;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _02_GetAllRowColumn extends JDBCParent {

    @Test
    public void test01() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from film");

        ResultSetMetaData rSmD = rs.getMetaData(); // Colon sayısı, Kolon isimleri, Tipleri getMetaData ile alınır

        int columnCount = rSmD.getColumnCount(); // Kolon sayısını columnCount içine attık.
        System.out.println("columnCount = " + columnCount);//Kaç kolon olduğunu bulduk.

        for (int i = 1; i <= columnCount; i++) {
            String columnName = rSmD.getColumnName(i); // Kolonun adı
            String columnType = rSmD.getColumnTypeName(i); // Kolonun tipi char-tinyInt-timestamp gibi

            System.out.println(columnType + " - " + columnName);
        }

    }

    @Test
    public void test02() throws SQLException {
        // language tablosundaki tüm satırları ve tüm sütunları yazdırınız,
        // aynı mysql sonuç ekranında olduğu gibi
        ResultSet rs = statement.executeQuery("select * from language");

        ResultSetMetaData rSmD = rs.getMetaData();

        for (int i = 1; i <= rSmD.getColumnCount(); i++)
            System.out.printf("%-20s",rSmD.getColumnName(i));

        System.out.println();

        while (rs.next()) {

            for (int i = 1; i <= rSmD.getColumnCount(); i++)
                System.out.printf("%-20s",rs.getString(i));

            System.out.println();

        }

    }
    @Test
    public void test03() throws SQLException {

        // actor tablosundaki tüm satırları ve tüm sütunları yazdırınız, aynı mysql sonuç ekranında olduğu gibi
        // fakat metod kullanınız, metoda sorguyu gönderiniz ve orada yazdırınız.
        // getTable("select * from actor");

        getTable("select * from actor");

    }
    public void getTable(String sorgu) throws SQLException {

        ResultSet rs = statement.executeQuery(sorgu);
        ResultSetMetaData rSmD = rs.getMetaData();

        for (int i = 1; i <= rSmD.getColumnCount(); i++)
            System.out.printf("%-20s",rSmD.getColumnName(i));

        System.out.println();

        while (rs.next()) {

            for (int i = 1; i <= rSmD.getColumnCount(); i++)
                System.out.printf("%-20s",rs.getString(i));

            System.out.println();

        }
    }
}