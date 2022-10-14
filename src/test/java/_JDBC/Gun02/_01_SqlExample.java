package _JDBC.Gun02;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_SqlExample extends JDBCParent{

    ResultSet rs;

    @Test
    public void test00() throws SQLException {

        rs = statement.executeQuery("select city_id,city,country_id from city");
        rs.first();
        rs.last();

        String id = rs.getString(1);
        System.out.println("ID : " + id);

        int idInt = rs.getInt(1);
        System.out.println("idInt : " + idInt);

        String name = rs.getString(2);
        System.out.println("name = " + name);

        // hepsini String olarak alabiliriz. Tipi uygun olmayanları INTEGER olarak alamayız

//        int nameInt = rs.getInt(2);
//        System.out.println("nameInt = " + nameInt);

//        int kacinciSatir = rs.getRow();
//        System.out.println("kacinciSatir = " + kacinciSatir);
        rs.first();
        rs.absolute(5);
        rs.getRow();
        String city = rs.getString("city");
        System.out.println("RoW : " + city);

    }
}
