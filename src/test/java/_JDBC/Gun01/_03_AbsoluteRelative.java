package _JDBC.Gun01;

import _JDBC.Gun02.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_AbsoluteRelative extends JDBCParent {

    @Test
    private void test1() throws SQLException {
        // next(): bir sonraki
        // previous(): bir önceki row
        // absolute(4): baştan itibaren 4.ROW a gider
        // relative(3): bulunduğun yerden itibaren 3 ROW gider

        ResultSet rs = statement.executeQuery("select * from city");
        rs.absolute(10); // 10. satıra git
        String city = rs.getString("city");
        System.out.println("city 10 : " + city);

        rs.absolute(15); // 15. satıra git
        city = rs.getString("city");
        System.out.println("city 15 : " + city);

        rs.absolute(-15); // sondan 15.satıra git
        city = rs.getString("city");
        System.out.println("city -15 : " + city);

        rs.relative(5); // bulunduğu yerden 5 adım ileri
        city = rs.getString("city");
        System.out.println("city 5 : " + city);

        rs.relative(-5); // bulunduğu yerden 5 adım geri
        city = rs.getString("city");
        System.out.println("city -5 : " + city);

        rs.first();
        city = rs.getString("city");
        System.out.println(city);

        rs.last();
        city = rs.getString("city");
        System.out.println(city);

        rs.getRow();
        city = rs.getString("city");
        System.out.println("ROW : " + city);

        do {
            rs.getRow();
            city = rs.getString("city");
            System.out.println("ROW : " + city);
        }while (rs.next());
    }
}
